package com.hd.action.mlsd;


import com.hd.api.business.MlsdItemAdvantageService;
import com.hd.common.action.BaseAction;
import com.hd.common.log.hdLog;
import com.hd.common.utils.SystemEnvUtil;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.MlsdItemAdvantageVo;
import com.hd.entity.business.MlsdMobileItemAdvantageVo;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.MlsdItemAdvantage;
import com.hd.entity.generator.MlsdMobileItemAdvantage;
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
* @Description:    项目优势
* @Author:         shangYuRen
* @CreateDate:     2019/10/9 14:47
*/
@Controller
@RequestMapping("mlsd/itemAdvantage")
public class MlsdItemAdvantageAction extends BaseAction {
    @Autowired
    MlsdItemAdvantageService mlsdItemAdvantageService;

    @RequestMapping("/goUpdateMlsdItemAdvantage")
    public String goUpdateMlsdItemAdvantage(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: goUpdateMlsdBrandCulture
         * 描述： 跳转修改品牌文化
         * 作者: shangyuren
         * 修改日期： 2019/10/9 11:31
         * @param  [request, response] <br>
         */
        try {

            Object[] getMlsdItemAdvantageResult = mlsdItemAdvantageService.getMlsdItemAdvantage();
            if (!RetCodeAndMessage.SUCCESS[0].equals(getMlsdItemAdvantageResult[0])) {
                request.setAttribute("message", getMlsdItemAdvantageResult[2]);
            }
            MlsdItemAdvantageVo mlsdItemAdvantageVo = (MlsdItemAdvantageVo) getMlsdItemAdvantageResult[2];
            String frontPicPath = SystemEnvUtil.getSystemEnv("mlsd_front_server_url") + "pic/";
            request.setAttribute("mlsdItemAdvantageVo", mlsdItemAdvantageVo);
            request.setAttribute("frontPicPath", frontPicPath);
            return "/mlsd/mlsdPage/itemAdvantagePage";
        } catch (Exception e) {
            hdLog.error("|MlsdItemAdvantageAction|goUpdateMlsdItemAdvantage|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }


    @RequestMapping("/updateMlsdItemAdvantage")
    public void updateMlsdItemAdvantage(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateMlsdItemAdvantage
         * 描述： 更新项目优势
         * 作者: shangyuren
         * 修改日期： 2019/10/9 14:49
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Date currentDate = new Date();
            String banner1 = request.getParameter("picPath01");
            String companyShowsTextImgUrl = request.getParameter("picPath02");
            String companyShowsTitleImgUrl = request.getParameter("picPath03");
            String companyShowsImgUrl = request.getParameter("picPath04");
            String companyShowsAdvantageImgUrl = request.getParameter("picPath05");
            String supportImgUrl = request.getParameter("picPath06");

            if (StringUtils.isBlank(banner1) || StringUtils.isBlank(companyShowsTextImgUrl) || StringUtils.isBlank(companyShowsTitleImgUrl) ||
                    StringUtils.isBlank(companyShowsImgUrl)  || StringUtils.isBlank(companyShowsAdvantageImgUrl)  || StringUtils.isBlank(supportImgUrl)
            ) {
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }

            MlsdItemAdvantage mlsdItemAdvantage = new MlsdItemAdvantage();
            mlsdItemAdvantage.setId(new BigInteger(ConstantPoll.MLSD_ID));
            mlsdItemAdvantage.setBanner1(banner1);
            mlsdItemAdvantage.setCompanyShowsAdvantageImgUrl(companyShowsAdvantageImgUrl);
            mlsdItemAdvantage.setCompanyShowsImgUrl(companyShowsImgUrl);
            mlsdItemAdvantage.setCompanyShowsTextImgUrl(companyShowsTextImgUrl);
            mlsdItemAdvantage.setCompanyShowsTitleImgUrl(companyShowsTitleImgUrl);
            mlsdItemAdvantage.setSupportImgUrl(supportImgUrl);


            Object[] updateMlsdItemAdvantageResult = mlsdItemAdvantageService.updateMlsdItemAdvantage(mlsdItemAdvantage);
            json = RetCodeAndMessage.getRetJson(updateMlsdItemAdvantageResult);
            this.renderJson(json.toString(), response);
            return;

        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|MlsdItemAdvantageAction|updateCompanyProfile|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }


    @RequestMapping("/goUpdateMlsdMobileItemAdvantage")
    public String goUpdateMlsdMobileItemAdvantage(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: goUpdateMlsdMobileItemAdvantage
         * 描述： 跳转修改品牌文化(移动版)
         * 作者: shangyuren
         * 修改日期： 2019/11/20 13:43
         * @param  [request, response] <br>
         */

        try {

            Object[] getMlsdMobileItemAdvantageResult = mlsdItemAdvantageService.getMlsdMobileItemAdvantage();
            if (!RetCodeAndMessage.SUCCESS[0].equals(getMlsdMobileItemAdvantageResult[0])) {
                request.setAttribute("message", getMlsdMobileItemAdvantageResult[2]);
            }
            MlsdMobileItemAdvantageVo mlsdMobileItemAdvantageVo = (MlsdMobileItemAdvantageVo) getMlsdMobileItemAdvantageResult[2];
            String frontPicPath = SystemEnvUtil.getSystemEnv("mlsd_front_server_url") + "pic/";
            request.setAttribute("mlsdMobileItemAdvantageVo", mlsdMobileItemAdvantageVo);
            request.setAttribute("frontPicPath", frontPicPath);
            return "/mlsd/mlsdPage/itemAdvantagePage_mobile";
        } catch (Exception e) {
            hdLog.error("|MlsdItemAdvantageAction|goUpdateMlsdMobileItemAdvantage|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }


    @RequestMapping("/updateMlsdMobileItemAdvantage")
    public void updateMlsdMobileItemAdvantage(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateMlsdMobileItemAdvantage
         * 描述： 更新项目优势（移动）
         * 作者: shangyuren
         * 修改日期： 2019/11/20 13:43
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Date currentDate = new Date();
            String showImage1 = request.getParameter("picPath01");
            String showImage2 = request.getParameter("picPath02");

            String text1 = request.getParameter("text1");
            String text2 = request.getParameter("text2");

            if (StringUtils.isBlank(showImage1) || StringUtils.isBlank(showImage2) || StringUtils.isBlank(text1) ||StringUtils.isBlank(text2)) {
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }

            MlsdMobileItemAdvantage mlsdMobileItemAdvantage = new MlsdMobileItemAdvantage();
            mlsdMobileItemAdvantage.setId(new BigInteger(ConstantPoll.MLSD_ID));
            mlsdMobileItemAdvantage.setShowImage1(showImage1);
            mlsdMobileItemAdvantage.setShowImage2(showImage2);
            mlsdMobileItemAdvantage.setText1(text1);
            mlsdMobileItemAdvantage.setText2(text2);

            Object[] updateMlsdMobileItemAdvantageResult = mlsdItemAdvantageService.updateMlsdMobileItemAdvantage(mlsdMobileItemAdvantage);
            json = RetCodeAndMessage.getRetJson(updateMlsdMobileItemAdvantageResult);
            this.renderJson(json.toString(), response);
            return;

        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|MlsdItemAdvantageAction|updateMlsdMobileItemAdvantage|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }

}
