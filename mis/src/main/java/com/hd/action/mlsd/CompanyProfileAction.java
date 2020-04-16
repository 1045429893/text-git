package com.hd.action.mlsd;


import com.hd.api.business.CompanyProfileService;
import com.hd.common.action.BaseAction;
import com.hd.common.log.hdLog;
import com.hd.entity.business.CompanyProfileVo;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.MlsdCompanyProfile;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;
import java.util.Date;

/**
 * @Description: 公司简介
 * @Author: shangYuRen
 * @CreateDate: 2019/8/19 15:21
 */
@Controller
@RequestMapping("mlsd/companyProfile")
public class CompanyProfileAction extends BaseAction {
    @Autowired
    CompanyProfileService companyProfileService;

    @RequestMapping("/goCompanyProfile")
    public String goCompanyProfile(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: goCompanyProfile
         * 描述： 跳转公司简介
         * 作者: shangyuren
         * 修改日期： 2019/8/19 15:22
         * @param  [request, response] <br>
         */
        try {

            Object[] getCompanyProfileResult = companyProfileService.getCompanyProfile();
            if (RetCodeAndMessage.SUCCESS[0].equals(getCompanyProfileResult[0])) {
                request.setAttribute("message", getCompanyProfileResult[2]);
            }
            CompanyProfileVo companyProfileVo = (CompanyProfileVo) getCompanyProfileResult[2];
            request.setAttribute("companyProfileVo", companyProfileVo);
            return "/mlsd/companyProfile/companyProfileView";
        } catch (Exception e) {
            hdLog.error("|CompanyProfileAction|goCompanyProfile|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }


    @RequestMapping("/updateCompanyProfile")
    public void updateCompanyProfile(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateCompanyProfile
         * 描述： 修改公司简介
         * 作者: shangyuren
         * 修改日期： 2019/9/29 11:29
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Date currentDate = new Date();
            String id = request.getParameter("id");
            String companyAddress = request.getParameter("companyAddress");
            String companyName = request.getParameter("companyName");
            String hotLine = request.getParameter("hotLine");
            String email = request.getParameter("email");
            String url = request.getParameter("url");

            if (StringUtils.isBlank(id) || StringUtils.isBlank(companyAddress) || StringUtils.isBlank(companyName)
                    || StringUtils.isBlank(hotLine) || StringUtils.isBlank(email) || StringUtils.isBlank(url)) {
                this.renderJson(RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER).toString(), response);
                return;
            }
            MlsdCompanyProfile mlsdCompanyProfile=new MlsdCompanyProfile();
            mlsdCompanyProfile.setId(new BigInteger(id));
            mlsdCompanyProfile.setCompanyAddress(companyAddress);
            mlsdCompanyProfile.setCompanyName(companyName);
            mlsdCompanyProfile.setHotLine(hotLine);
            mlsdCompanyProfile.setEmail(email);
            mlsdCompanyProfile.setUrl(url);
            mlsdCompanyProfile.setCreateTime(currentDate);
            mlsdCompanyProfile.setCreateTime(currentDate);
            mlsdCompanyProfile.setIsShow(ConstantPoll.START_INT);
            Object[] updateCompanyProfileResult = companyProfileService.updateCompanyProfile(mlsdCompanyProfile);
            json = RetCodeAndMessage.getRetJson(updateCompanyProfileResult);
            this.renderJson(json.toString(), response);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|CompanyProfileAction|updateCompanyProfile|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }


}
