package com.hd.action.mlsd;


import com.hd.api.business.MlsdJoinInvestmentService;
import com.hd.api.business.MlsdStoreDisplayService;
import com.hd.common.action.BaseAction;
import com.hd.common.log.hdLog;
import com.hd.common.utils.SystemEnvUtil;
import com.hd.entity.business.*;
import com.hd.entity.generator.MlsdJoinInvestment;
import com.hd.entity.generator.MlsdMobileStoreDisplay;
import com.hd.entity.generator.MlsdStoreDisplay;
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
* @Description:    门店展示
* @Author:         shangYuRen
* @CreateDate:     2019/10/10 14:20
*/
@Controller
@RequestMapping("mlsd/storeDisplay")
public class MlsdStoreDisplayAction extends BaseAction {
    @Autowired
    MlsdStoreDisplayService mlsdStoreDisplayService;

    @RequestMapping("/goUpdateMlsdStoreDisplay")
    public String goUpdateMlsdStoreDisplay(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: goUpdateMlsdStoreDisplay
         * 描述：跳转修改展示
         * 作者: shangyuren
         * 修改日期： 2019/10/9 15:47
         * @param  [request, response] <br>
         */
        try {

            Object[] getMlsdStoreDisplayResult = mlsdStoreDisplayService.getMlsdStoreDisplay();
            if (!RetCodeAndMessage.SUCCESS[0].equals(getMlsdStoreDisplayResult[0])) {
                request.setAttribute("message", getMlsdStoreDisplayResult[2]);
            }
            MlsdStoreDisplayVo mlsdStoreDisplayVo = (MlsdStoreDisplayVo) getMlsdStoreDisplayResult[2];
            String frontPicPath = SystemEnvUtil.getSystemEnv("mlsd_front_server_url") + "pic/";
            request.setAttribute("mlsdStoreDisplayVo", mlsdStoreDisplayVo);
            request.setAttribute("frontPicPath", frontPicPath);
            return "/mlsd/mlsdPage/storeDisplay";
        } catch (Exception e) {
            hdLog.error("|MlsdStoreDisplayAction|goUpdateMlsdStoreDisplay|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }


    @RequestMapping("/updateMlsdStoreDisplay")
    public void updateMlsdStoreDisplay(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateMlsdStoreDisplay
         * 描述：
         * 作者: shangyuren
         * 修改日期： 2019/10/9 15:46
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Date currentDate = new Date();
            String banner1 = request.getParameter("picPath01");
            String storeDisplayImgUrl1 = request.getParameter("picPath02");
            String storeDisplayImgUrl2 = request.getParameter("picPath03");
            String storeDisplayImgUrl3 = request.getParameter("picPath04");
            String storeDisplayImgUrl4 = request.getParameter("picPath05");
            String makeShowTitleImgUrl = request.getParameter("picPath06");
            String makeShowImgUrl1 = request.getParameter("picPath07");
            String makeShowImgUrl2 = request.getParameter("picPath08");
            String makeShowImgUrl3 = request.getParameter("picPath09");
            if (StringUtils.isBlank(banner1) || StringUtils.isBlank(storeDisplayImgUrl1) || StringUtils.isBlank(storeDisplayImgUrl2) || StringUtils.isBlank(storeDisplayImgUrl3) ||
                    StringUtils.isBlank(storeDisplayImgUrl4) || StringUtils.isBlank(makeShowTitleImgUrl) || StringUtils.isBlank(makeShowImgUrl1) || StringUtils.isBlank(makeShowImgUrl2) ||
                    StringUtils.isBlank(makeShowImgUrl3)   ) {
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }

            MlsdStoreDisplay mlsdStoreDisplay = new MlsdStoreDisplay();
            mlsdStoreDisplay.setId(new BigInteger(ConstantPoll.MLSD_ID));
            mlsdStoreDisplay.setBanner1(banner1);
            mlsdStoreDisplay.setMakeShowTitleImgUrl(makeShowTitleImgUrl);
            mlsdStoreDisplay.setMakeShowImgUrl1(makeShowImgUrl1);
            mlsdStoreDisplay.setMakeShowImgUrl2(makeShowImgUrl2);
            mlsdStoreDisplay.setMakeShowImgUrl3(makeShowImgUrl3);
            mlsdStoreDisplay.setStoreDisplayImgUrl1(storeDisplayImgUrl1);
            mlsdStoreDisplay.setStoreDisplayImgUrl2(storeDisplayImgUrl2);
            mlsdStoreDisplay.setStoreDisplayImgUrl3(storeDisplayImgUrl3);
            mlsdStoreDisplay.setStoreDisplayImgUrl4(storeDisplayImgUrl4);
            Object[] updateMlsdJoinInvestmentResult = mlsdStoreDisplayService.updateMlsdStoreDisplay(mlsdStoreDisplay);
            json = RetCodeAndMessage.getRetJson(updateMlsdJoinInvestmentResult);
            this.renderJson(json.toString(), response);
            return;

        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|MlsdStoreDisplayAction|updateMlsdJoinInvestment|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }

    @RequestMapping("/goUpdateMlsdMobileStoreDisplay")
    public String goUpdateMlsdMobileStoreDisplay(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: goUpdateMlsdMobileStoreDisplay
         * 描述：跳转修改展示
         * 作者: shangyuren
         * 修改日期： 2019/10/9 15:47
         * @param  [request, response] <br>
         */
        try {

            Object[] getMlsdMobileStoreDisplayResult = mlsdStoreDisplayService.getMlsdMobileStoreDisplay();
            if (!RetCodeAndMessage.SUCCESS[0].equals(getMlsdMobileStoreDisplayResult[0])) {
                request.setAttribute("message", getMlsdMobileStoreDisplayResult[2]);
            }
            MlsdMobileStoreDisplayVo mlsdMobileStoreDisplayVo = (MlsdMobileStoreDisplayVo) getMlsdMobileStoreDisplayResult[2];
            String frontPicPath = SystemEnvUtil.getSystemEnv("mlsd_front_server_url") + "pic/";
            request.setAttribute("mlsdStoreDisplayVo", mlsdMobileStoreDisplayVo);
            request.setAttribute("frontPicPath", frontPicPath);
            return "/mlsd/mlsdPage/storeDisplay_mobile";
        } catch (Exception e) {
            hdLog.error("|MlsdStoreDisplayAction|goUpdateMlsdStoreDisplay|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }


    @RequestMapping("/updateMlsdMobileStoreDisplay")
    public void updateMlsdMobileStoreDisplay(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateMlsdMobileStoreDisplay
         * 描述：
         * 作者: shangyuren
         * 修改日期： 2019/10/9 15:46
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Date currentDate = new Date();
            String storeDisplayImgUrl1 = request.getParameter("picPath01");
            String storeDisplayImgUrl2 = request.getParameter("picPath02");
            String storeDisplayImgUrl3 = request.getParameter("picPath03");
            String storeDisplayText = request.getParameter("text");

            if (StringUtils.isBlank(storeDisplayText) || StringUtils.isBlank(storeDisplayImgUrl1) || StringUtils.isBlank(storeDisplayImgUrl2) || StringUtils.isBlank(storeDisplayImgUrl3) ) {
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }

            MlsdMobileStoreDisplay mlsdMobileStoreDisplay = new MlsdMobileStoreDisplay();
            mlsdMobileStoreDisplay.setId(new BigInteger(ConstantPoll.MLSD_ID));

            mlsdMobileStoreDisplay.setStoreDisplayImgUrl1(storeDisplayImgUrl1);
            mlsdMobileStoreDisplay.setStoreDisplayImgUrl2(storeDisplayImgUrl2);
            mlsdMobileStoreDisplay.setStoreDisplayImgUrl3(storeDisplayImgUrl3);
            mlsdMobileStoreDisplay.setStoreDisplayText(storeDisplayText);
            Object[] updateMlsdJoinInvestmentResult = mlsdStoreDisplayService.updateMlsdMobileStoreDisplay(mlsdMobileStoreDisplay);
            json = RetCodeAndMessage.getRetJson(updateMlsdJoinInvestmentResult);
            this.renderJson(json.toString(), response);
            return;

        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|MlsdStoreDisplayAction|updateMlsdMobileJoinInvestment|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }

}
