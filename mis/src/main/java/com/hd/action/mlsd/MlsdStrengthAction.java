package com.hd.action.mlsd;


import com.hd.api.business.MlsdStoreDisplayService;
import com.hd.api.business.MlsdStrengthService;
import com.hd.common.action.BaseAction;
import com.hd.common.log.hdLog;
import com.hd.common.utils.SystemEnvUtil;
import com.hd.entity.business.*;
import com.hd.entity.generator.MlsdMobileStrength;
import com.hd.entity.generator.MlsdStoreDisplay;
import com.hd.entity.generator.MlsdStrength;
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
* @Description:    实力后台
* @Author:         shangYuRen
* @CreateDate:     2019/10/10 15:08
*/
@Controller
@RequestMapping("mlsd/strength")
public class MlsdStrengthAction extends BaseAction {
    @Autowired
    MlsdStrengthService mlsdStrengthService;

    @RequestMapping("/goUpdateMlsdStrength")
    public String goUpdateMlsdStrength(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: goUpdateMlsdStoreDisplay
         * 描述：跳转修改展示
         * 作者: shangyuren
         * 修改日期： 2019/10/9 15:47
         * @param  [request, response] <br>
         */
        try {

            Object[] getMlsdStrengthResult = mlsdStrengthService.getMlsdStrength();
            if (!RetCodeAndMessage.SUCCESS[0].equals(getMlsdStrengthResult[0])) {
                request.setAttribute("message", getMlsdStrengthResult[2]);
            }
            MlsdStrengthVo mlsdStrengthVo = (MlsdStrengthVo) getMlsdStrengthResult[2];
            String frontPicPath = SystemEnvUtil.getSystemEnv("mlsd_front_server_url") + "pic/";
            request.setAttribute("mlsdStrengthVo", mlsdStrengthVo);
            request.setAttribute("frontPicPath", frontPicPath);
            return "/mlsd/mlsdPage/strength";
        } catch (Exception e) {
            hdLog.error("|MlsdStrengthAction|goUpdateMlsdStrength|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }


    @RequestMapping("/updateMlsdStrength")
    public void updateMlsdStrength(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateMlsdStrength
         * 描述：
         * 作者: shangyuren
         * 修改日期： 2019/10/9 15:46
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Date currentDate = new Date();
            String banner1 = request.getParameter("picPath01");
            String strengthImgUrl1 = request.getParameter("picPath02");
            String strengthImgUrl2 = request.getParameter("picPath03");
            String strengthImgUrl3 = request.getParameter("picPath04");
//            String strengthImgUrl4 = request.getParameter("picPath05");
//            String strengthImgUrl5 = request.getParameter("picPath06");
//            String strengthImgUrl6 = request.getParameter("picPath07");
            String integrityShowImgUrl1 = request.getParameter("picPath08");
            String integrityShowImgUrl2 = request.getParameter("picPath09");
            String signUpCaseImgUrl = request.getParameter("picPath10");
            if (StringUtils.isBlank(banner1) || StringUtils.isBlank(strengthImgUrl1) || StringUtils.isBlank(strengthImgUrl2) || StringUtils.isBlank(strengthImgUrl3) ||
//                    StringUtils.isBlank(strengthImgUrl4) || StringUtils.isBlank(strengthImgUrl5) || StringUtils.isBlank(strengthImgUrl6)
                     StringUtils.isBlank(integrityShowImgUrl1) ||
                    StringUtils.isBlank(integrityShowImgUrl2) ||StringUtils.isBlank(signUpCaseImgUrl)   ) {
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }

            MlsdStrength mlsdStrength = new MlsdStrength();
            mlsdStrength.setId(new BigInteger(ConstantPoll.MLSD_ID));
            mlsdStrength.setBanner1(banner1);
            mlsdStrength.setSignUpCaseImgUrl( signUpCaseImgUrl);

            mlsdStrength.setIntegrityShowImgUrl1( integrityShowImgUrl1);
            mlsdStrength.setIntegrityShowImgUrl2( integrityShowImgUrl2);

            mlsdStrength.setStrengthImgUrl1(strengthImgUrl1);
            mlsdStrength.setStrengthImgUrl2(strengthImgUrl2);
            mlsdStrength.setStrengthImgUrl3(strengthImgUrl3);
            mlsdStrength.setStrengthImgUrl4("");
            mlsdStrength.setStrengthImgUrl5("");
            mlsdStrength.setStrengthImgUrl6("");

            Object[] updateMlsdStrengthResult = mlsdStrengthService.updateMlsdStrength(mlsdStrength);
            json = RetCodeAndMessage.getRetJson(updateMlsdStrengthResult);
            this.renderJson(json.toString(), response);
            return;

        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|MlsdStrengthAction|updateMlsdStrength|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }


    @RequestMapping("/goUpdateMlsdMobileStrength")
    public String goUpdateMlsdMobileStrength(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: goUpdateMobileMlsdStrength
         * 描述：跳转修改展示
         * 作者: shangyuren
         * 修改日期： 2019/10/9 15:47
         * @param  [request, response] <br>
         */
        try {

            Object[] getMlsdMobileStrengthResult = mlsdStrengthService.getMlsdMobileStrength();
            if (!RetCodeAndMessage.SUCCESS[0].equals(getMlsdMobileStrengthResult[0])) {
                request.setAttribute("message", getMlsdMobileStrengthResult[2]);
            }
            MlsdMobileStrengthVo mlsdMobileStrengthVo = (MlsdMobileStrengthVo) getMlsdMobileStrengthResult[2];
            String frontPicPath = SystemEnvUtil.getSystemEnv("mlsd_front_server_url") + "pic/";
            request.setAttribute("mlsdMobileStrengthVo", mlsdMobileStrengthVo);
            request.setAttribute("frontPicPath", frontPicPath);
            return "/mlsd/mlsdPage/strength_mobile";
        } catch (Exception e) {
            hdLog.error("|MlsdStrengthAction|goUpdateMobileMlsdStrength|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }


    @RequestMapping("/updateMlsdMobileStrength")
    public void updateMlsdMobileStrength(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateMlsdMobileStrength
         * 描述：
         * 作者: shangyuren
         * 修改日期： 2019/10/9 15:46
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Date currentDate = new Date();
            String strengthImgUrl1 = request.getParameter("picPath01");
            String strengthImgUrl2 = request.getParameter("picPath02");
            String strengthImgUrl3 = request.getParameter("picPath03");
            String strengthImgUrl4 = request.getParameter("picPath04");
            String strengthImgUrl5 = request.getParameter("picPath05");
            String strengthImgUrl6 = request.getParameter("picPath06");
            String strengthImgUrl7 = request.getParameter("picPath07");
            String strengthImgUrl8 = request.getParameter("picPath08");

            if (StringUtils.isBlank(strengthImgUrl1) || StringUtils.isBlank(strengthImgUrl2) || StringUtils.isBlank(strengthImgUrl3) ||
                    StringUtils.isBlank(strengthImgUrl4) || StringUtils.isBlank(strengthImgUrl5) || StringUtils.isBlank(strengthImgUrl6)||
                    StringUtils.isBlank(strengthImgUrl7) || StringUtils.isBlank(strengthImgUrl8)   ) {
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }

            MlsdMobileStrength mlsdStrength = new MlsdMobileStrength();
            mlsdStrength.setId(new BigInteger(ConstantPoll.MLSD_ID));
            mlsdStrength.setStrengthImgUrl1(strengthImgUrl1);
            mlsdStrength.setStrengthImgUrl2(strengthImgUrl2);
            mlsdStrength.setStrengthImgUrl3(strengthImgUrl3);
            mlsdStrength.setStrengthImgUrl4(strengthImgUrl4);
            mlsdStrength.setStrengthImgUrl5(strengthImgUrl5);
            mlsdStrength.setStrengthImgUrl6(strengthImgUrl6);
            mlsdStrength.setStrengthImgUrl7(strengthImgUrl7);
            mlsdStrength.setStrengthImgUrl8(strengthImgUrl8);

            Object[] updateMlsdMobileStrengthResult = mlsdStrengthService.updateMlsdMobileStrength(mlsdStrength);
            json = RetCodeAndMessage.getRetJson(updateMlsdMobileStrengthResult);
            this.renderJson(json.toString(), response);
            return;

        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|MlsdStrengthAction|updateMlsdMobileStrength|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }
}
