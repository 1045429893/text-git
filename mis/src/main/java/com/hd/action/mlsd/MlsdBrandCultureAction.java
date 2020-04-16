package com.hd.action.mlsd;


import com.hd.api.business.MlsdBrandCultureService;
import com.hd.api.business.MlsdHomePageService;
import com.hd.common.action.BaseAction;
import com.hd.common.log.hdLog;
import com.hd.common.utils.SystemEnvUtil;
import com.hd.entity.business.*;
import com.hd.entity.generator.MlsdBrandCulture;
import com.hd.entity.generator.MlsdHomePage;
import com.hd.entity.generator.MlsdMobileBrandCulture;
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
 * @Description: 品牌文化
 * @Author: shangYuRen
 * @CreateDate: 2019/10/9 11:20
 */
@Controller
@RequestMapping("mlsd/brandCulture")
public class MlsdBrandCultureAction extends BaseAction {
    @Autowired
    MlsdBrandCultureService mlsdBrandCultureService;

    @RequestMapping("/goUpdateMlsdBrandCulture")
    public String goUpdateMlsdBrandCulture(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: goUpdateMlsdBrandCulture
         * 描述： 跳转修改品牌文化
         * 作者: shangyuren
         * 修改日期： 2019/10/9 11:31
         * @param  [request, response] <br>
         */
        try {

            Object[] getMlsdBrandCultureResult = mlsdBrandCultureService.getMlsdBrandCulture();
            if (!RetCodeAndMessage.SUCCESS[0].equals(getMlsdBrandCultureResult[0])) {
                request.setAttribute("message", getMlsdBrandCultureResult[2]);
            }
            MlsdBrandCultureVo mlsdBrandCultureVo = (MlsdBrandCultureVo) getMlsdBrandCultureResult[2];
            String frontPicPath = SystemEnvUtil.getSystemEnv("mlsd_front_server_url") + "pic/";
            request.setAttribute("mlsdBrandCultureVo", mlsdBrandCultureVo);
            request.setAttribute("frontPicPath", frontPicPath);
            return "/mlsd/mlsdPage/brandCulturePage";
        } catch (Exception e) {
            hdLog.error("|MlsdBrandCultureAction|goUpdateMlsdBrandCulture|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }


    @RequestMapping("/updateMlsdBrandCulture")
    public void updateMlsdBrandCulture(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateMlsdBrandCulture
         * 描述： 更新品牌展示
         * 作者: shangyuren
         * 修改日期： 2019/10/9 14:49
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Date currentDate = new Date();
            String banner1 = request.getParameter("picPath01");
            String introduceTextImgUrl = request.getParameter("picPath02");
            String introduceProductImgUrl = request.getParameter("picPath03");
            String introduceIntroImgUrl = request.getParameter("picPath04");
            String productPositioningImgUrl = request.getParameter("picPath05");
            String productPositioningTextImgUrl = request.getParameter("picPath06");
            String productFeatureImgUrl = request.getParameter("picPath07");

            if (StringUtils.isBlank(banner1) || StringUtils.isBlank(introduceIntroImgUrl) || StringUtils.isBlank(productPositioningImgUrl) ||
                    StringUtils.isBlank(introduceTextImgUrl) || StringUtils.isBlank(productFeatureImgUrl) || StringUtils.isBlank(introduceProductImgUrl)
                    || StringUtils.isBlank(productPositioningTextImgUrl)
            ) {
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }

            MlsdBrandCulture mlsdBrandCulture = new MlsdBrandCulture();
            mlsdBrandCulture.setId(new BigInteger(ConstantPoll.MLSD_ID));
            mlsdBrandCulture.setBanner1(banner1);
            mlsdBrandCulture.setIntroduceIntroImgUrl(introduceIntroImgUrl);
            mlsdBrandCulture.setIntroduceProductImgUrl(introduceProductImgUrl);
            mlsdBrandCulture.setIntroduceTextImgUrl(introduceTextImgUrl);
            mlsdBrandCulture.setProductFeatureImgUrl(productFeatureImgUrl);
            mlsdBrandCulture.setProductPositioningImgUrl(productPositioningImgUrl);
            mlsdBrandCulture.setProductPositioningTextImgUrl(productPositioningTextImgUrl);
            Object[] updateMlsdBrandCultureResult = mlsdBrandCultureService.updateMlsdBrandCulture(mlsdBrandCulture);
            json = RetCodeAndMessage.getRetJson(updateMlsdBrandCultureResult);
            this.renderJson(json.toString(), response);
            return;

        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|MlsdBrandCultureAction|updateCompanyProfile|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }

    @RequestMapping("/goUpdateMlsdMobileBrandCulture")
    public String goUpdateMlsdMobileBrandCulture(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: goUpdateMlsdMobileBrandCulture
         * 描述： 跳转修改品牌文化(移动版)
         * 作者: shangyuren
         * 修改日期： 2019/11/20 11:40
         * @param  [request, response] <br>
         */
        try {

            Object[] getMlsdMobileBrandCultureResult = mlsdBrandCultureService.getMlsdMobileBrandCulture();
            if (!RetCodeAndMessage.SUCCESS[0].equals(getMlsdMobileBrandCultureResult[0])) {
                request.setAttribute("message", getMlsdMobileBrandCultureResult[2]);
            }
            MlsdMobileBrandCultureVo mlsdMobileBrandCultureVo = (MlsdMobileBrandCultureVo) getMlsdMobileBrandCultureResult[2];
            String frontPicPath = SystemEnvUtil.getSystemEnv("mlsd_front_server_url") + "pic/";
            request.setAttribute("mlsdMobileBrandCultureVo", mlsdMobileBrandCultureVo);
            request.setAttribute("frontPicPath", frontPicPath);
            return "/mlsd/mlsdPage/brandCulturePage_mobile";
        } catch (Exception e) {
            hdLog.error("|MlsdBrandCultureAction|goUpdateMlsdMobileBrandCulture|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }


    @RequestMapping("/updateMlsdMobileBrandCulture")
    public void updateMlsdMobileBrandCulture(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateMlsdBrandCulture
         * 描述： 更新品牌展示（移动版）
         * 作者: shangyuren
         * 修改日期： 2019/11/20 11:40
         * @param  [request, response] <br>
         */

        JSONObject json;
        try {
            Date currentDate = new Date();
            String introduceTextImgUrl = request.getParameter("picPath01");
            String introduceProductImgUrl = request.getParameter("picPath02");

            if (StringUtils.isBlank(introduceTextImgUrl) || StringUtils.isBlank(introduceProductImgUrl)) {
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }

            MlsdMobileBrandCulture mlsdMobileBrandCulture = new MlsdMobileBrandCulture();
            mlsdMobileBrandCulture.setId(new BigInteger(ConstantPoll.MLSD_ID));
            mlsdMobileBrandCulture.setIntroduceProductImgUrl(introduceProductImgUrl);
            mlsdMobileBrandCulture.setIntroduceTextImgUrl(introduceTextImgUrl);
            Object[] updateMlsdBrandCultureResult = mlsdBrandCultureService.updateMlsdMobileBrandCulture(mlsdMobileBrandCulture);
            json = RetCodeAndMessage.getRetJson(updateMlsdBrandCultureResult);
            this.renderJson(json.toString(), response);
            return;

        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|MlsdBrandCultureAction|updateMlsdMobileBrandCulture|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }

}
