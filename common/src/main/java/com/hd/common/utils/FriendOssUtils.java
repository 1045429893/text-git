package com.hd.common.utils;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.common.utils.BinaryUtil;
import com.aliyun.oss.model.MatchMode;
import com.aliyun.oss.model.PolicyConditions;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.sts.model.v20150401.AssumeRoleRequest;
import com.aliyuncs.sts.model.v20150401.AssumeRoleResponse;

import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author 马兴亮
 * @Date 2017/6/21 8:59
 * @Description
 */
public class FriendOssUtils {
    // 目前只有"cn-hangzhou"这个region可用, 不要使用填写其他region的值
    public static final String REGION_CN_HANGZHOU = "cn-hangzhou";
    // 当前 STS API 版本
    public static final String STS_API_VERSION = "2015-04-01";

    public static Map<String, String> misUploadFile() throws UnsupportedEncodingException {
        String endpoint = "oss-cn-qingdao.aliyuncs.com";
        String accessKeyId = "LTAIv6CUTMhYnCjq";
        String accessKeySecret = "G1pJ2NylAr1xRrNliGbJFkHxNuEq3g";
        String bucket = "hongding-public";
        String dir = "friend_mis/";
        String host = "http://"+bucket+"."+endpoint;

        OSSClient client = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        long expireTime = 300;
        long expireEndTime = System.currentTimeMillis() + expireTime * 1000;
        Date expiration = new Date(expireEndTime);
        PolicyConditions policyConds = new PolicyConditions();
        policyConds.addConditionItem(PolicyConditions.COND_CONTENT_LENGTH_RANGE, 0, 1048576000);
        policyConds.addConditionItem(MatchMode.StartWith, PolicyConditions.COND_KEY, dir);

        String postPolicy = client.generatePostPolicy(expiration, policyConds);
        byte[] binaryData = postPolicy.getBytes("utf-8");
        String encodedPolicy = BinaryUtil.toBase64String(binaryData);
        String postSignature = client.calculatePostSignature(postPolicy);

        Map<String, String> respMap = new LinkedHashMap<String, String>();
        respMap.put("accessid", accessKeyId);
        respMap.put("policy", encodedPolicy);
        respMap.put("signature", postSignature);
        //respMap.put("expire", formatISO8601Date(expiration));
        respMap.put("dir", dir);
        respMap.put("host", host);
        respMap.put("expire", String.valueOf(expireEndTime));
        return respMap;
    }

    public static Map<String, String> appGetOssToken() throws ClientException {
        String accessKeyId = "LTAIv6CUTMhYnCjq";
        String accessKeySecret = "G1pJ2NylAr1xRrNliGbJFkHxNuEq3g";
        // 只有 RAM用户（子账号）才能调用 AssumeRole 接口
        // 阿里云主账号的AccessKeys不能用于发起AssumeRole请求
        // 请首先在RAM控制台创建一个RAM用户，并为这个用户创建AccessKeys  accessId  accessKey
        // AssumeRole API 请求参数: RoleArn, RoleSessionName, Policy, and DurationSeconds
        // RoleArn 需要在 RAM 控制台上获取
        String roleArn = "acs:ram::1071516542424841:role/hdrole";
        // RoleSessionName 是临时Token的会话名称，自己指定用于标识你的用户，主要用于审计，或者用于区分Token颁发给谁
        // 但是注意RoleSessionName的长度和规则，不要有空格，只能有'-' '_' 字母和数字等字符
        // 具体规则请参考API文档中的格式要求
        String roleSessionName = "001";
        // 如何定制你的policy?
        String policy = "{\n" +
                "    \"Version\": \"1\", \n" +
                "    \"Statement\": [\n" +
                "        {\n" +
                "            \"Action\": [\n" +
                "                   \"oss:PutObject\"   \n     "+
                //"                \"oss:PutObject\", \n" +
                //"                \"oss:GetObject\" \n" +
                "            ], \n" +
                "            \"Resource\": [\n" +
                "                \"acs:oss:*:*:hongding-public/app/*\"\n" +
                "            ], \n" +
                "            \"Effect\": \"Allow\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        // 此处必须为 HTTPS
        ProtocolType protocolType = ProtocolType.HTTPS;
        HashMap<String, String> result = new HashMap<>();
        Long durationSeconds = 30*60L;
        final AssumeRoleResponse response = assumeRole(accessKeyId, accessKeySecret,
                roleArn, roleSessionName, policy, protocolType,30*60L);
        Long currentTime = new java.util.Date().getTime();
        result.put("expiration",String.valueOf(currentTime+durationSeconds*1000L-5*60*1000L));
        result.put("accessKeyId",response.getCredentials().getAccessKeyId());
        result.put("accessKeySecret",response.getCredentials().getAccessKeySecret());
        result.put("securityToken",response.getCredentials().getSecurityToken());
        return result;


    }

    static AssumeRoleResponse assumeRole(String accessKeyId, String accessKeySecret,
                                         String roleArn, String roleSessionName, String policy,
                                         ProtocolType protocolType,Long durationSeconds) throws ClientException {
        try {
            // 创建一个 Aliyun Acs Client, 用于发起 OpenAPI 请求
            IClientProfile profile = DefaultProfile.getProfile(REGION_CN_HANGZHOU, accessKeyId, accessKeySecret);
            DefaultAcsClient client = new DefaultAcsClient(profile);
            // 创建一个 AssumeRoleRequest 并设置请求参数
            final AssumeRoleRequest request = new AssumeRoleRequest();
            request.setVersion(STS_API_VERSION);
            request.setMethod(MethodType.POST);
            request.setProtocol(protocolType);
            request.setRoleArn(roleArn);
            request.setRoleSessionName(roleSessionName);
            request.setPolicy(policy);
            request.setDurationSeconds(durationSeconds);
            // 发起请求，并得到response
            final AssumeRoleResponse response = client.getAcsResponse(request);
            return response;
        } catch (ClientException e) {
            throw e;
        }
    }
}
