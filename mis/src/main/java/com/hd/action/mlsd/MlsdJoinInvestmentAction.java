package com.hd.action.mlsd;


import com.hd.api.business.MlsdHomePageService;
import com.hd.api.business.MlsdJoinInvestmentService;
import com.hd.common.action.BaseAction;
import com.hd.common.log.hdLog;
import com.hd.common.utils.SystemEnvUtil;
import com.hd.entity.business.*;
import com.hd.entity.generator.MlsdHomePage;
import com.hd.entity.generator.MlsdJoinInvestment;
import com.hd.entity.generator.MlsdMobileJoinInvestment;
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
 * @Description: 招商加盟
 * @Author: shangYuRen
 * @CreateDate: 2019/10/9 15:45
 */
@Controller
@RequestMapping("mlsd/joinInvestment")
public class MlsdJoinInvestmentAction extends BaseAction {
    @Autowired
    MlsdJoinInvestmentService mlsdJoinInvestmentService;

    @RequestMapping("/goUpdateMlsdJoinInvestment")
    public String goUpdateMlsdJoinInvestment(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: goUpdateMlsdJoinInvestment
         * 描述：
         * 作者: shangyuren
         * 修改日期： 2019/10/9 15:47
         * @param  [request, response] <br>
         */
        try {

            Object[] getMlsdJoinInvestmentResult = mlsdJoinInvestmentService.getMlsdJoinInvestment();
            if (!RetCodeAndMessage.SUCCESS[0].equals(getMlsdJoinInvestmentResult[0])) {
                request.setAttribute("message", getMlsdJoinInvestmentResult[2]);
            }
            MlsdJoinInvestmentVo mlsdJoinInvestmentVo = (MlsdJoinInvestmentVo) getMlsdJoinInvestmentResult[2];
            String frontPicPath = SystemEnvUtil.getSystemEnv("mlsd_front_server_url") + "pic/";
            request.setAttribute("mlsdJoinInvestmentVo", mlsdJoinInvestmentVo);
            request.setAttribute("frontPicPath", frontPicPath);
            return "/mlsd/mlsdPage/joinInvestment";
        } catch (Exception e) {
            hdLog.error("|MlsdHomPageAction|goUpdateMlsdJoinInvestment|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }


    @RequestMapping("/updateMlsdJoinInvestment")
    public void updateMlsdJoinInvestment(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateMlsdJoinInvestment
         * 描述：
         * 作者: shangyuren
         * 修改日期： 2019/10/9 15:46
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Date currentDate = new Date();
            String banner1 = request.getParameter("picPath01");
            String partnershipImgUrl1 = request.getParameter("picPath02");
            String partnershipImgUrl2 = request.getParameter("picPath03");
            String partnershipImgUrl3 = request.getParameter("picPath04");
            String imgUrl1 = request.getParameter("picPath05");
            String imgUrl2 = request.getParameter("picPath06");
            String imgUrl3 = request.getParameter("picPath07");
            String imgUrl4 = request.getParameter("picPath08");
            String imgUrl5 = request.getParameter("picPath09");
            String imgUrl6 = request.getParameter("picPath10");
            String imgUrl7 = request.getParameter("picPath11");
            String imgUrl8 = request.getParameter("picPath12");
            String partnershipImgUrl = request.getParameter("picPath13");

            if (StringUtils.isBlank(banner1) || StringUtils.isBlank(partnershipImgUrl1) || StringUtils.isBlank(partnershipImgUrl2) || StringUtils.isBlank(partnershipImgUrl3) ||
                    StringUtils.isBlank(partnershipImgUrl) || StringUtils.isBlank(imgUrl1) || StringUtils.isBlank(imgUrl2) || StringUtils.isBlank(imgUrl3) ||
                    StringUtils.isBlank(imgUrl4) || StringUtils.isBlank(imgUrl5) || StringUtils.isBlank(imgUrl6) || StringUtils.isBlank(imgUrl7) || StringUtils.isBlank(imgUrl8)
            ) {
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }

            MlsdJoinInvestment mlsdJoinInvestment = new MlsdJoinInvestment();
            mlsdJoinInvestment.setId(new BigInteger(ConstantPoll.MLSD_ID));
            mlsdJoinInvestment.setBanner1(banner1);
            mlsdJoinInvestment.setImgUrl1(imgUrl1);
            mlsdJoinInvestment.setImgUrl2(imgUrl2);
            mlsdJoinInvestment.setImgUrl3(imgUrl3);
            mlsdJoinInvestment.setImgUrl4(imgUrl4);
            mlsdJoinInvestment.setImgUrl5(imgUrl5);
            mlsdJoinInvestment.setImgUrl6(imgUrl6);
            mlsdJoinInvestment.setImgUrl7(imgUrl7);
            mlsdJoinInvestment.setImgUrl8(imgUrl8);
            mlsdJoinInvestment.setPartnershipImgUrl(partnershipImgUrl);
            mlsdJoinInvestment.setPartnershipImgUrl1(partnershipImgUrl1);
            mlsdJoinInvestment.setPartnershipImgUrl2(partnershipImgUrl2);
            mlsdJoinInvestment.setPartnershipImgUrl3(partnershipImgUrl3);
            Object[] updateMlsdJoinInvestmentResult = mlsdJoinInvestmentService.updateMlsdJoinInvestment(mlsdJoinInvestment);
            json = RetCodeAndMessage.getRetJson(updateMlsdJoinInvestmentResult);
            this.renderJson(json.toString(), response);
            return;

        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|MlsdHomPageAction|updateMlsdJoinInvestment|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }

    @RequestMapping("/goUpdateMlsdMobileJoinInvestment")
    public String goUpdateMlsdMobileJoinInvestment(HttpServletRequest request, HttpServletResponse response) {
       /**
        * 方法名称: goUpdateMlsdMobileJoinInvestment
        * 描述： 跳转招商加盟
        * 作者: shangyuren
        * 修改日期： 2019/11/21 9:04
        * @param  [request, response] <br>
        */
        try {

            Object[]getMlsdMobileJoinInvestmentResult = mlsdJoinInvestmentService.getMlsdMobileJoinInvestment();
            if (!RetCodeAndMessage.SUCCESS[0].equals(getMlsdMobileJoinInvestmentResult[0])) {
                request.setAttribute("message", getMlsdMobileJoinInvestmentResult[2]);
            }
            MlsdMobileJoinInvestmentVo mlsdMobileJoinInvestmentVo = (MlsdMobileJoinInvestmentVo) getMlsdMobileJoinInvestmentResult[2];
            String frontPicPath = SystemEnvUtil.getSystemEnv("mlsd_front_server_url") + "pic/";
            request.setAttribute("mlsdMobileJoinInvestmentVo", mlsdMobileJoinInvestmentVo);
            request.setAttribute("frontPicPath", frontPicPath);
            return "/mlsd/mlsdPage/joinInvestment_mobile";
        } catch (Exception e) {
            hdLog.error("|MlsdHomPageAction|goUpdateMlsdJoinInvestment|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }


    @RequestMapping("/updateMlsdMobileJoinInvestment")
    public void updateMlsdMobileJoinInvestment(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateMlsdJoinInvestment
         * 描述：
         * 作者: shangyuren
         * 修改日期： 2019/10/9 15:46
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Date currentDate = new Date();

            String imgUrl1 = request.getParameter("picPath05");
            String imgUrl2 = request.getParameter("picPath06");
            String imgUrl3 = request.getParameter("picPath07");
            String imgUrl4 = request.getParameter("picPath08");
            String imgUrl5 = request.getParameter("picPath09");
            String imgUrl6 = request.getParameter("picPath10");

            if (StringUtils.isBlank(imgUrl1) || StringUtils.isBlank(imgUrl2) || StringUtils.isBlank(imgUrl3) ||
                    StringUtils.isBlank(imgUrl4) || StringUtils.isBlank(imgUrl5) || StringUtils.isBlank(imgUrl6)
            ) {
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }

            MlsdMobileJoinInvestment mlsdMobileJoinInvestment = new MlsdMobileJoinInvestment();
            mlsdMobileJoinInvestment.setId(new BigInteger(ConstantPoll.MLSD_ID));
            mlsdMobileJoinInvestment.setImgUrl1(imgUrl1);
            mlsdMobileJoinInvestment.setImgUrl2(imgUrl2);
            mlsdMobileJoinInvestment.setImgUrl3(imgUrl3);
            mlsdMobileJoinInvestment.setImgUrl4(imgUrl4);
            mlsdMobileJoinInvestment.setImgUrl5(imgUrl5);
            mlsdMobileJoinInvestment.setImgUrl6(imgUrl6);

            Object[] updateMlsdJoinInvestmentResult = mlsdJoinInvestmentService.updateMlsdMobileJoinInvestment(mlsdMobileJoinInvestment);
            json = RetCodeAndMessage.getRetJson(updateMlsdJoinInvestmentResult);
            this.renderJson(json.toString(), response);
            return;

        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|MlsdHomPageAction|updateMlsdJoinInvestment|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }


}
