package com.hd.action.mlsd;


import com.hd.api.business.MlsdContactUsService;
import com.hd.api.business.MlsdStrengthService;
import com.hd.common.action.BaseAction;
import com.hd.common.log.hdLog;
import com.hd.common.utils.SystemEnvUtil;
import com.hd.entity.business.*;
import com.hd.entity.generator.MlsdContactUs;
import com.hd.entity.generator.MlsdMobileContactUs;
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
* @Description:    联系我们
* @Author:         shangYuRen
* @CreateDate:     2019/10/10 15:08
*/
@Controller
@RequestMapping("mlsd/contactUs")
public class MlsdContactUsAction extends BaseAction {
    @Autowired
    MlsdContactUsService mlsdContactUsService;

    @RequestMapping("/goUpdateMlsdContactUs")
    public String goUpdateMlsdContactUs(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: goUpdateMlsdContactUs
         * 描述：跳转联系我们
         * 作者: shangyuren
         * 修改日期： 2019/10/9 15:47
         * @param  [request, response] <br>
         */
        try {

            Object[] getMlsdContactUsResult = mlsdContactUsService.getMlsdContactUs();
            if (!RetCodeAndMessage.SUCCESS[0].equals(getMlsdContactUsResult[0])) {
                request.setAttribute("message", getMlsdContactUsResult[2]);
            }
            MlsdContactUsVo mlsdContactUsVo = (MlsdContactUsVo) getMlsdContactUsResult[2];
            String frontPicPath = SystemEnvUtil.getSystemEnv("mlsd_front_server_url") + "pic/";
            request.setAttribute("mlsdContactUsVo", mlsdContactUsVo);
            request.setAttribute("frontPicPath", frontPicPath);
            return "/mlsd/mlsdPage/contactUs";
        } catch (Exception e) {
            hdLog.error("|MlsdContactUsAction|goUpdateMlsdContactUs|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }


    @RequestMapping("/updateMlsdContactUs")
    public void updateMlsdContactUs(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateMlsdContactUs
         * 描述：
         * 作者: shangyuren
         * 修改日期： 2019/10/9 15:46
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Date currentDate = new Date();
            String banner1 = request.getParameter("picPath01");
            String imgUrl = request.getParameter("picPath02");
            String contactIcon = request.getParameter("picPath03");
            String text1 = request.getParameter("text1");
            String text2 = request.getParameter("text2");
            String text3 = request.getParameter("text3");
            if (StringUtils.isBlank(banner1) || StringUtils.isBlank(imgUrl) || StringUtils.isBlank(contactIcon)  ) {
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }
            MlsdContactUs mlsdContactUs = new MlsdContactUs();
            mlsdContactUs.setId(new BigInteger(ConstantPoll.MLSD_ID));
            mlsdContactUs.setBanner1(banner1);
            mlsdContactUs.setContactIcon(contactIcon);
            mlsdContactUs.setImgUrl(imgUrl);
            mlsdContactUs.setText1(text1);
            mlsdContactUs.setText2(text2);
            mlsdContactUs.setText3(text3);

            Object[] updateMlsdContactUsResult = mlsdContactUsService.updateMlsdContactUs(mlsdContactUs);
            json = RetCodeAndMessage.getRetJson(updateMlsdContactUsResult);
            this.renderJson(json.toString(), response);
            return;

        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|MlsdContactUsAction|updateMlsdContactUs|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }


    @RequestMapping("/goUpdateMlsdMobileContactUs")
    public String goUpdateMlsdMobileContactUs(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: goUpdateMlsdMobileContactUs
         * 描述：跳转联系我们
         * 作者: shangyuren
         * 修改日期： 2019/10/9 15:47
         * @param  [request, response] <br>
         */
        try {

            Object[] getMlsdMbileContactUsResult = mlsdContactUsService.getMlsdMbileContactUs();
            if (!RetCodeAndMessage.SUCCESS[0].equals(getMlsdMbileContactUsResult[0])) {
                request.setAttribute("message", getMlsdMbileContactUsResult[2]);
            }
            MlsdMobileContactUsVo mlsdMobileContactUsVo = (MlsdMobileContactUsVo) getMlsdMbileContactUsResult[2];
            String frontPicPath = SystemEnvUtil.getSystemEnv("mlsd_front_server_url") + "pic/";
            request.setAttribute("mlsdMobileContactUsVo", mlsdMobileContactUsVo);
            request.setAttribute("frontPicPath", frontPicPath);
            return "/mlsd/mlsdPage/contactUs_mobile";
        } catch (Exception e) {
            hdLog.error("|MlsdContactUsAction|goUpdateMlsdMobileContactUs|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }


    @RequestMapping("/updateMlsdMobileContactUs")
    public void updateMlsdMobileContactUs(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateMlsdContactUs
         * 描述：
         * 作者: shangyuren
         * 修改日期： 2019/10/9 15:46
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Date currentDate = new Date();
            String imgUrl = request.getParameter("picPath01");
            String text1 = request.getParameter("text1");
            String text2 = request.getParameter("text2");
            String text3 = request.getParameter("text3");
            if ( StringUtils.isBlank(imgUrl) ) {
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }
            MlsdMobileContactUs mlsdMobileContactUs = new MlsdMobileContactUs();
            mlsdMobileContactUs.setId(new BigInteger(ConstantPoll.MLSD_ID));
            mlsdMobileContactUs.setImgUrl(imgUrl);
            mlsdMobileContactUs.setText1(text1);
            mlsdMobileContactUs.setText2(text2);
            mlsdMobileContactUs.setText3(text3);

            Object[] updateMlsdMobileContactUsResult = mlsdContactUsService.updateMlsdMobileContactUs(mlsdMobileContactUs);
            json = RetCodeAndMessage.getRetJson(updateMlsdMobileContactUsResult);
            this.renderJson(json.toString(), response);
            return;

        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|MlsdContactUsAction|updateMlsdMobileContactUs|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }

}
