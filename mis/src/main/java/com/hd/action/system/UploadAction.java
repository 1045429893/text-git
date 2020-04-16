package com.hd.action.system;

import com.hd.common.action.BaseAction;
import com.hd.common.utils.SystemEnvUtil;
import com.hd.common.utils.UUID;
import com.hd.entity.business.RetCodeAndMessage;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

@Controller
@RequestMapping("/upload")
public class UploadAction extends BaseAction {

    @RequestMapping("/goUploadFile")
    public String goUploadFile(HttpServletRequest request, HttpServletResponse response){
        return "mlsd/fileUploadDemo";
    }

    /**
     * 多个文件上传
     *
     * @author qiunan 2016年4月15日
     * @param request
     * @param response
     * @return
     * @throws IllegalStateException
     * @throws IOException
     */
    @RequestMapping("/file")
    public void uploadFile(HttpServletRequest request, HttpServletResponse response) throws IllegalStateException, IOException {
        JSONObject json;
        try {
            //初始化通用multipart解析器
            CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
            if (!multipartResolver.isMultipart(request)) {
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            Iterator<String> iter = multiRequest.getFileNames();
            if (iter != null && iter.hasNext()) {
                MultipartFile file = multiRequest.getFile(iter.next());

                if (null != file) {
                    String myFileName = file.getOriginalFilename();
                    if (myFileName == null || "".equals(myFileName.trim()) || myFileName.length() < 5) {
                        json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                        this.renderJson(json.toString(), response);
                        return;
                    } else if ((!".png".equals(myFileName.substring(myFileName.length() - 4).toLowerCase()) && (!".jpg".equals(myFileName.substring(myFileName.length() - 4).toLowerCase())))) {
                        json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                        this.renderJson(json.toString(), response);
                        return;
                    } else {
                        String fileName = UUID.getUUID() + (myFileName.substring(myFileName.length() - 4).toLowerCase());
                        String path = SystemEnvUtil.getSystemEnv("mlsd_front_pic_path") + fileName;
                        File fie = new File(path);
                        file.transferTo(fie);

                        json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SUCCESS);
                        json.put("fileName",fileName);
                        json.put("fileUrl",SystemEnvUtil.getSystemEnv("mlsd_front_server_url")+"pic/"+fileName);
                        //json.put("fileUrl","http://localhost:8000/pic/1DMKMEN68S0PR45S61UNPQ1VMB8POCD4.png");
                        //json.put("fileUrl","http://ceshi2.hongdingnet.com:9010/pic/1DMKMEN68S0PR45S61UNPQ1VMB8POCD4.png");
                        this.renderJson(json.toString(), response);
                        return;
                    }
                } else {
                    json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                    this.renderJson(json.toString(), response);
                    return;
                }
            }
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
            this.renderJson(json.toString(), response);
            return;

        }catch (Exception e){
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.NET);
            this.renderJson(json.toString(), response);
            return;
        }
    }



}

