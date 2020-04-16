package com.hd.service.business;

import com.hd.api.business.SystemAuthorityService;
import com.hd.api.generator.SysAuthorityGeneratorService;
import com.hd.api.generator.SysAuthorityResourcesGeneratorService;
import com.hd.common.utils.HDJsonUtils;
import com.hd.common.utils.ServiceRetCode;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.SysAuthority;
import com.hd.entity.generator.SysAuthorityExample;
import com.hd.entity.generator.SysAuthorityResources;
import com.hd.entity.generator.SysAuthorityResourcesExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.StringUtils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by liujindong on 2017/8/25.
 */
@Service
public class SystemAuthorityServiceImpl implements SystemAuthorityService {

    @Autowired
    SysAuthorityGeneratorService sysAuthorityGeneratorService;
    @Autowired
    SysAuthorityResourcesGeneratorService sysAuthorityResourcesGeneratorService;

    @Override
    @Transactional
    public Object[] addAuthority(SysAuthority sysAuthority, String resourcesIds) {
        /** 
         * @Author 刘金东 
         * @Date 2017/9/6 上午10:04 
         * @params [sysAuthority 权限, resourcesIds 一组资源信息ID用[,]分割] 
         * @return java.lang.Object[]
         * @Description 添加权限
         */
        boolean flag = sysAuthorityGeneratorService.insertSelective(sysAuthority);
        if (flag) {//权限表未保存成功,直接返回失败,不进行中间表保存操作
            if (!this.addSysAuthorityResources(sysAuthority.getId(), resourcesIds)) {//创建不成功,返回失败,并且回滚此事务
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return ServiceRetCode.returnCode(RetCodeAndMessage.FAIL);
            }
        } else {
            return ServiceRetCode.returnCode(RetCodeAndMessage.FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    @Transactional
    public Object[] updateAuthority(SysAuthority sysAuthority, String resourcesIds) {
        boolean flag = sysAuthorityGeneratorService.updateByPrimaryKeySelective(sysAuthority);
        if (flag) {
            SysAuthorityResourcesExample sysAutResExample = new SysAuthorityResourcesExample();
            SysAuthorityResourcesExample.Criteria sysAutResCriteria = sysAutResExample.createCriteria();
            sysAutResCriteria.andSysAuthorityIdEqualTo(sysAuthority.getId().toString());
            sysAuthorityResourcesGeneratorService.physicalDeleteByExample(sysAutResExample);
            if (!this.addSysAuthorityResources(sysAuthority.getId(), resourcesIds)) {//添加中间表,失败需要回滚
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return ServiceRetCode.returnCode(RetCodeAndMessage.FAIL);
            }
        } else {
            return ServiceRetCode.returnCode(RetCodeAndMessage.FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    public boolean addSysAuthorityResources(BigInteger authorityId, String resourcesIds) {
        /** 
         * @Author 刘金东 
         * @Date 2017/9/6 上午10:51 
         * @params [authorityId, resourcesIds] 
         * @return boolean 添加权限与资源中间表,true为成功,若返回false引用处应进行回滚事务操作
          * @Description
          */
        if (!StringUtils.isEmpty(resourcesIds)) {
            String[] resourcesidList = resourcesIds.split(",");
            if (resourcesidList != null && resourcesidList.length > 0) {
                Date time = new Date();//当前时间
                for (int i = 0; i < resourcesidList.length; i++) {
                    SysAuthorityResources sysAuthorityResources = new SysAuthorityResources();
                    sysAuthorityResources.setSysAuthorityId(authorityId);
                    sysAuthorityResources.setSysResourcesId(new BigInteger(resourcesidList[i]));
                    sysAuthorityResources.setCreateTime(time);
                    sysAuthorityResources.setUpdateTime(time);
                    boolean flag = sysAuthorityResourcesGeneratorService.insertSelective(sysAuthorityResources);
                    if (!flag) {//创建不成功,返回失败,上层方法需要进行回滚操作
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    @Transactional
    public Object[] deleteAuthority(BigInteger id) {
        SysAuthorityResourcesExample sysAutResExample = new SysAuthorityResourcesExample();
        SysAuthorityResourcesExample.Criteria sysAutResCriteria = sysAutResExample.createCriteria();
        sysAutResCriteria.andSysAuthorityIdEqualTo(id.toString());
        sysAuthorityResourcesGeneratorService.physicalDeleteByExample(sysAutResExample);
        if(!sysAuthorityGeneratorService.physicalDeleteByPrimaryKey(id)){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    public SysAuthority getAuthorityById(BigInteger id) {
        return sysAuthorityGeneratorService.selectByPrimaryKey(id);
    }

    @Override
    public List<SysAuthorityResources> getSysAuthorityResourcesByAuthorityId(String authorityId) {
        SysAuthorityResourcesExample example = new SysAuthorityResourcesExample();
        SysAuthorityResourcesExample.Criteria criteria = example.createCriteria();
        criteria.andSysAuthorityIdEqualTo(authorityId);
        return sysAuthorityResourcesGeneratorService.selectByExample(example);
    }

    @Override
    public Object[] getAuthorityPage(Integer page, Integer pageSize, String name) {
        /** 
         * @Author 刘金东 
         * @Date 2017/8/31 上午9:45 
         * @params [page, pageSize, name] 
         * @return java.lang.Object[]
         * @Description Authority分页查询,name为查询条件(模糊查询)
         */
        List<SysAuthority> sysAuthorityList = new ArrayList<>();
        SysAuthorityExample example = new SysAuthorityExample();
        example.setPage(page, pageSize);
        if (!StringUtils.isEmpty(name) && !"null".equals(name) && !"undefined".equals(name)) {
            SysAuthorityExample.Criteria criteria = example.createCriteria();
            criteria.andNameLike("%" + name + "%");
        }
        Integer count = sysAuthorityGeneratorService.countByExample(example);
        if (count > 0) {
            sysAuthorityList = sysAuthorityGeneratorService.selectByExample(example);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, HDJsonUtils.convertArrayIncludeDate(sysAuthorityList, "yyyy-MM-dd HH:mm:ss"), count);
    }

    @Override
    public boolean checkAuthoritName(String name,String operate, String authorityId) {
        /** 
         * @Author 刘金东 
         * @Date 2017/9/5 上午11:09 
         * @params [name] 
         * @return boolean
         * @Description 判断name是否已经存在
         */
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        SysAuthorityExample example = new SysAuthorityExample();
        SysAuthorityExample.Criteria criteria = example.createCriteria();
        if("UPDATE".equals(operate)){
            if(!StringUtils.isEmpty(authorityId)){
                criteria.andIdNotEqualTo(authorityId);
            }
        }
        criteria.andNameEqualTo(name);
        Integer count = sysAuthorityGeneratorService.countByExample(example);
        if (count > 0) {
            return false;
        } else {
            return true;
        }
    }


}
