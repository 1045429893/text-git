package com.hd.action.mlsd;


import com.hd.api.business.MlsdProductPresentationService;
import com.hd.common.action.BaseAction;
import com.hd.common.log.hdLog;
import com.hd.common.utils.SystemEnvUtil;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.MlsdMobileProductPresentationVo;
import com.hd.entity.business.MlsdProductPresentationVo;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.MlsdMobileProductPresentation;
import com.hd.entity.generator.MlsdProductPresentation;
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
 * @Description: 产品介绍
 * @Author: shangYuRen
 * @CreateDate: 2019/10/10 9:47
 */
@Controller
@RequestMapping("mlsd/productPresentation")
public class MlsdProductPresentationAction extends BaseAction {
    @Autowired
    MlsdProductPresentationService mlsdProductPresentationService;

    @RequestMapping("/goUpdateProductPresentation")
    public String goUpdateProductPresentation(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: goUpdateProductPresentation
         * 描述： 跳转修改产品介绍
         * 作者: shangyuren
         * 修改日期： 2019/10/10 9:49
         * @param  [request, response] <br>
         */
        try {

            Object[] getMlsdProductPresentationResult = mlsdProductPresentationService.getMlsdProductPresentation();
            if (!RetCodeAndMessage.SUCCESS[0].equals(getMlsdProductPresentationResult[0])) {
                request.setAttribute("message", getMlsdProductPresentationResult[2]);
            }
            MlsdProductPresentationVo mlsdProductPresentationVo = (MlsdProductPresentationVo) getMlsdProductPresentationResult[2];
            String frontPicPath = SystemEnvUtil.getSystemEnv("mlsd_front_server_url") + "pic/";
            request.setAttribute("mlsdProductPresentationVo", mlsdProductPresentationVo);
            request.setAttribute("frontPicPath", frontPicPath);
            return "/mlsd/mlsdPage/productPresentation";
        } catch (Exception e) {
            hdLog.error("|MlsdProductPresentationAction|goUpdateProductPresentation|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }


    @RequestMapping("/updateMlsdProductPresentation")
    public void updateMlsdProductPresentation(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateMlsdProductPresentation
         * 描述： 修改产品介绍
         * 作者: shangyuren
         * 修改日期： 2019/10/10 10:04
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Date currentDate = new Date();
            String banner1 = request.getParameter("picPath01");
            //新品推荐图片
            String newRoductsImgUrl1 = request.getParameter("picPath02");
            String newRoductsImgUrl2 = request.getParameter("picPath03");
            String newRoductsImgUrl3 = request.getParameter("picPath04");
            String newRoductsImgUrl4 = request.getParameter("picPath05");
            String newRoductsImgUrl5 = request.getParameter("picPath06");
            String newRoductsImgUrl6 = request.getParameter("picPath07");
            String newRoductsImgUrl7 = request.getParameter("picPath08");
            String newRoductsImgUrl8 = request.getParameter("picPath09");
            //招牌美食图片
            String signatureCuisineimgUrl1 = request.getParameter("picPath10");
            String signatureCuisineimgUrl2 = request.getParameter("picPath11");
            String signatureCuisineimgUrl3 = request.getParameter("picPath12");
            String signatureCuisineimgUrl4 = request.getParameter("picPath13");
            String signatureCuisineimgUrl5 = request.getParameter("picPath14");
            String signatureCuisineimgUrl6 = request.getParameter("picPath15");
            String productListImgUrl = request.getParameter("picPath16");
            //新品推荐 名称
            String newRoductsTitle1 = request.getParameter("newRoductsTitle1");
            String newRoductsTitle2 = request.getParameter("newRoductsTitle2");
            String newRoductsTitle3 = request.getParameter("newRoductsTitle3");
            String newRoductsTitle4 = request.getParameter("newRoductsTitle4");
            String newRoductsTitle5 = request.getParameter("newRoductsTitle5");
            String newRoductsTitle6 = request.getParameter("newRoductsTitle6");
            String newRoductsTitle7 = request.getParameter("newRoductsTitle7");
            String newRoductsTitle8 = request.getParameter("newRoductsTitle8");
            if (StringUtils.isBlank(banner1) || StringUtils.isBlank(newRoductsImgUrl1) || StringUtils.isBlank(newRoductsImgUrl2) || StringUtils.isBlank(newRoductsImgUrl3) ||
                    StringUtils.isBlank(newRoductsImgUrl4) || StringUtils.isBlank(newRoductsImgUrl5) || StringUtils.isBlank(newRoductsImgUrl6) || StringUtils.isBlank(newRoductsImgUrl7) ||
                    StringUtils.isBlank(newRoductsImgUrl8) || StringUtils.isBlank(newRoductsTitle1) || StringUtils.isBlank(newRoductsTitle2) || StringUtils.isBlank(newRoductsTitle3) ||
                    StringUtils.isBlank(newRoductsTitle4) || StringUtils.isBlank(newRoductsTitle5) || StringUtils.isBlank(newRoductsTitle6) || StringUtils.isBlank(newRoductsTitle7) ||
                    StringUtils.isBlank(newRoductsTitle8) || StringUtils.isBlank(signatureCuisineimgUrl1) || StringUtils.isBlank(signatureCuisineimgUrl2) || StringUtils.isBlank(signatureCuisineimgUrl6) ||
                    StringUtils.isBlank(signatureCuisineimgUrl3) || StringUtils.isBlank(signatureCuisineimgUrl4) || StringUtils.isBlank(signatureCuisineimgUrl5)
            ) {
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }

            MlsdProductPresentation mlsdProductPresentation = new MlsdProductPresentation();
            mlsdProductPresentation.setId(new BigInteger(ConstantPoll.MLSD_ID));
            mlsdProductPresentation.setBanner1(banner1);
            mlsdProductPresentation.setNewRoductsImgUrl1(newRoductsImgUrl1);
            mlsdProductPresentation.setNewRoductsImgUrl2(newRoductsImgUrl2);
            mlsdProductPresentation.setNewRoductsImgUrl3(newRoductsImgUrl3);
            mlsdProductPresentation.setNewRoductsImgUrl4(newRoductsImgUrl4);
            mlsdProductPresentation.setNewRoductsImgUrl5(newRoductsImgUrl5);
            mlsdProductPresentation.setNewRoductsImgUrl6(newRoductsImgUrl6);
            mlsdProductPresentation.setNewRoductsImgUrl7(newRoductsImgUrl7);
            mlsdProductPresentation.setNewRoductsImgUrl8(newRoductsImgUrl8);

            mlsdProductPresentation.setNewRoductsTitle1(newRoductsTitle1);
            mlsdProductPresentation.setNewRoductsTitle2(newRoductsTitle2);
            mlsdProductPresentation.setNewRoductsTitle3(newRoductsTitle3);
            mlsdProductPresentation.setNewRoductsTitle4(newRoductsTitle4);
            mlsdProductPresentation.setNewRoductsTitle5(newRoductsTitle5);
            mlsdProductPresentation.setNewRoductsTitle6(newRoductsTitle6);
            mlsdProductPresentation.setNewRoductsTitle7(newRoductsTitle7);
            mlsdProductPresentation.setNewRoductsTitle8(newRoductsTitle8);

            mlsdProductPresentation.setSignatureCuisineimgUrl1(signatureCuisineimgUrl1);
            mlsdProductPresentation.setSignatureCuisineimgUrl2(signatureCuisineimgUrl2);
            mlsdProductPresentation.setSignatureCuisineimgUrl3(signatureCuisineimgUrl3);
            mlsdProductPresentation.setSignatureCuisineimgUrl4(signatureCuisineimgUrl4);
            mlsdProductPresentation.setSignatureCuisineimgUrl5(signatureCuisineimgUrl5);
            mlsdProductPresentation.setSignatureCuisineimgUrl6(signatureCuisineimgUrl6);

            mlsdProductPresentation.setProductListImgUrl(productListImgUrl);

            Object[] updateMlsdHomePageResult = mlsdProductPresentationService.updateMlsdProductPresentation(mlsdProductPresentation);
            json = RetCodeAndMessage.getRetJson(updateMlsdHomePageResult);
            this.renderJson(json.toString(), response);
            return;

        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|MlsdProductPresentationAction|updateProductPresentation|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }


    @RequestMapping("/goUpdateMobileProductPresentation")
    public String goUpdateMobileProductPresentation(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: goUpdateMobileProductPresentation
         * 描述： 跳转修改产品介绍()
         * 作者: shangyuren
         * 修改日期： 2019/10/10 9:49
         * @param  [request, response] <br>
         */
        try {

            Object[] getMlsdMobileProductPresentation = mlsdProductPresentationService.getMlsdMobileProductPresentation();
            if (!RetCodeAndMessage.SUCCESS[0].equals(getMlsdMobileProductPresentation[0])) {
                request.setAttribute("message", getMlsdMobileProductPresentation[2]);
            }
            MlsdMobileProductPresentationVo mlsdMobileProductPresentationVo = (MlsdMobileProductPresentationVo) getMlsdMobileProductPresentation[2];
            String frontPicPath = SystemEnvUtil.getSystemEnv("mlsd_front_server_url") + "pic/";
            request.setAttribute("mlsdMobileProductPresentationVo", mlsdMobileProductPresentationVo);
            request.setAttribute("frontPicPath", frontPicPath);
            return "/mlsd/mlsdPage/productPresentation_mobile";
        } catch (Exception e) {
            hdLog.error("|MlsdProductPresentationAction|goUpdateMobileProductPresentation|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }


    @RequestMapping("/updateMlsdMobileProductPresentation")
    public void updateMlsdMobileProductPresentation(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateMlsdProductPresentation
         * 描述： 修改产品介绍
         * 作者: shangyuren
         * 修改日期： 2019/10/10 10:04
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Date currentDate = new Date();
            String newProductsTitleImgUrl = request.getParameter("picPath01");
            //新品推荐图片
            String newProductsImgUrl1 = request.getParameter("picPath02");
            String newProductsImgUrl2 = request.getParameter("picPath03");
            String newProductsImgUrl3 = request.getParameter("picPath04");
            String newProductsImgUrl4 = request.getParameter("picPath05");
            String  signatureCuisineimgTitleImgUrl= request.getParameter("picPath06");
            //招牌美食图片
            String signatureCuisineimgUrl1 = request.getParameter("picPath07");
            String signatureCuisineimgUrl2 = request.getParameter("picPath08");
            String signatureCuisineimgUrl3 = request.getParameter("picPath09");
            String signatureCuisineimgUrl4 = request.getParameter("picPath10");
            String productListImgUrl = request.getParameter("picPath11");



            if (StringUtils.isBlank(newProductsTitleImgUrl) || StringUtils.isBlank(newProductsImgUrl1) || StringUtils.isBlank(newProductsImgUrl2) || StringUtils.isBlank(newProductsImgUrl3) ||
                    StringUtils.isBlank(newProductsImgUrl4) || StringUtils.isBlank(signatureCuisineimgTitleImgUrl) || StringUtils.isBlank(signatureCuisineimgUrl1) || StringUtils.isBlank(signatureCuisineimgUrl2) ||
                    StringUtils.isBlank(signatureCuisineimgUrl3) || StringUtils.isBlank(signatureCuisineimgUrl4) || StringUtils.isBlank(productListImgUrl)
            ) {
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }

            MlsdMobileProductPresentation mlsdMobileProductPresentation = new MlsdMobileProductPresentation();
            mlsdMobileProductPresentation.setId(new BigInteger(ConstantPoll.MLSD_ID));
            mlsdMobileProductPresentation.setSignatureCuisineimgTitleImgUrl(signatureCuisineimgTitleImgUrl);
            mlsdMobileProductPresentation.setSignatureCuisineimgUrl1(signatureCuisineimgUrl1);
            mlsdMobileProductPresentation.setSignatureCuisineimgUrl2(signatureCuisineimgUrl2);
            mlsdMobileProductPresentation.setSignatureCuisineimgUrl3(signatureCuisineimgUrl3);
            mlsdMobileProductPresentation.setSignatureCuisineimgUrl4(signatureCuisineimgUrl4);
            mlsdMobileProductPresentation.setNewProductsTitleImgUrl(newProductsTitleImgUrl);
            mlsdMobileProductPresentation.setNewProductsImgUrl1(newProductsImgUrl1);
            mlsdMobileProductPresentation.setNewProductsImgUrl2(newProductsImgUrl2);
            mlsdMobileProductPresentation.setNewProductsImgUrl3(newProductsImgUrl3);
            mlsdMobileProductPresentation.setNewProductsImgUrl4(newProductsImgUrl4);
            mlsdMobileProductPresentation.setProductListImgUrl(productListImgUrl);

            Object[] updateMlsdMobileProductPresentationResult = mlsdProductPresentationService.updateMlsdMobileProductPresentation(mlsdMobileProductPresentation);
            json = RetCodeAndMessage.getRetJson(updateMlsdMobileProductPresentationResult);
            this.renderJson(json.toString(), response);
            return;

        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|MlsdProductPresentationAction|updateMlsdMobileProductPresentation|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }

}
