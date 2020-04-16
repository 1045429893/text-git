package com.hd.action.mlsd;


import com.hd.api.business.MlsdHomePageService;
import com.hd.common.action.BaseAction;
import com.hd.common.log.hdLog;
import com.hd.common.utils.SystemEnvUtil;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.MlsdHomePageVo;
import com.hd.entity.business.MlsdMobileHomePageVo;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.MlsdHomePage;
import com.hd.entity.generator.MlsdMobileHomePage;
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
* @Description:    首页展示
* @Author:         shangYuRen
* @CreateDate:     2019/10/8 14:57
*/
@Controller
@RequestMapping("mlsd/homePage")
public class MlsdHomPageAction extends BaseAction {
    @Autowired
    MlsdHomePageService mlsdHomePageService;

    @RequestMapping("/goUpdateHomePage")
    public String goUpdateHomePage(HttpServletRequest request, HttpServletResponse response) {
       /**
        * 方法名称: goUpdateHomePage
        * 描述： 跳转修改麻辣速递首页
        * 作者: shangyuren
        * 修改日期： 2019/10/8 14:59
        * @param  [request, response] <br>
        */
        try {

            Object[] getMlsdHomePageResult = mlsdHomePageService.getMlsdHomePage();
            if (!RetCodeAndMessage.SUCCESS[0].equals(getMlsdHomePageResult[0])) {
                request.setAttribute("message", getMlsdHomePageResult[2]);
            }
            MlsdHomePageVo mlsdHomePageVo = (MlsdHomePageVo) getMlsdHomePageResult[2];
            String frontPicPath = SystemEnvUtil.getSystemEnv("mlsd_front_server_url") + "pic/";
            request.setAttribute("mlsdHomePageVo", mlsdHomePageVo);
            request.setAttribute("frontPicPath", frontPicPath);
            return "/mlsd/mlsdPage/homePage";
        } catch (Exception e) {
            hdLog.error("|MlsdHomPageAction|goUpdateHomePage|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }


    @RequestMapping("/updateMlsdHomePage")
    public void updateMlsdHomePage(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateMlsdHomePage
         * 描述： 更新首页配置
         * 作者: shangyuren
         * 修改日期： 2019/10/8 15:37
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Date currentDate = new Date();
           String banner1 = request.getParameter("picPath01");
           String banner21 = request.getParameter("picPath02");
           String banner22 = request.getParameter("picPath03");
           String banner23 = request.getParameter("picPath04");
           String banner31 = request.getParameter("picPath05");
           String banner32 = request.getParameter("picPath06");
           String introduceTextImgUrl = request.getParameter("picPath07");
           String introduceProductImgUrl = request.getParameter("picPath08");
           String introduceIntroImgUrl = request.getParameter("picPath09");
           String profitImgUrl = request.getParameter("picPath10");
           String profitTextImgUrl = request.getParameter("picPath11");
           String shopSign1 = request.getParameter("picPath12");
           String shopSignBackground1 = request.getParameter("picPath13");
           String shopSign2 = request.getParameter("picPath14");
           String shopSignBackground2 = request.getParameter("picPath15");
           String shopSign3 = request.getParameter("picPath16");
           String shopSignBackground3 = request.getParameter("picPath17");
           String shopSign4 = request.getParameter("picPath18");
           String shopSignBackground4 = request.getParameter("picPath19");

            if(StringUtils.isBlank(banner1)||StringUtils.isBlank(banner21)||StringUtils.isBlank(banner22)||StringUtils.isBlank(banner23)||
                    StringUtils.isBlank(banner31)||StringUtils.isBlank(banner32)||StringUtils.isBlank(introduceTextImgUrl)||StringUtils.isBlank(introduceProductImgUrl)||
                    StringUtils.isBlank(introduceIntroImgUrl)||StringUtils.isBlank(profitImgUrl)||StringUtils.isBlank(profitTextImgUrl)||StringUtils.isBlank(shopSign1)||
                    StringUtils.isBlank(shopSign2)||StringUtils.isBlank(shopSign3)||StringUtils.isBlank(shopSign4)||StringUtils.isBlank(shopSignBackground1)||
                    StringUtils.isBlank(shopSignBackground2)||StringUtils.isBlank(shopSignBackground3)||StringUtils.isBlank(shopSignBackground4)
            ){
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }

            MlsdHomePage mlsdHomePage=new MlsdHomePage();
            mlsdHomePage.setId(new BigInteger(ConstantPoll.MLSD_ID));

            mlsdHomePage.setBanner1(banner1);
            mlsdHomePage.setBanner21(banner21);
            mlsdHomePage.setBanner22(banner22);
            mlsdHomePage.setBanner23(banner23);
            mlsdHomePage.setBanner31(banner31);
            mlsdHomePage.setBanner32(banner32);

            mlsdHomePage.setIntroduceIntroImgUrl(introduceIntroImgUrl);
            mlsdHomePage.setIntroduceProductImgUrl(introduceProductImgUrl);
            mlsdHomePage.setIntroduceTextImgUrl(introduceTextImgUrl);

            mlsdHomePage.setProfitImgUrl(profitImgUrl);
            mlsdHomePage.setProfitTextImgUrl(profitTextImgUrl);
            mlsdHomePage.setShopSign1(shopSign1);
            mlsdHomePage.setShopSign2(shopSign2);
            mlsdHomePage.setShopSign3(shopSign3);
            mlsdHomePage.setShopSign4(shopSign4);

            mlsdHomePage.setShopSignBackground1(shopSignBackground1);
            mlsdHomePage.setShopSignBackground2(shopSignBackground2);
            mlsdHomePage.setShopSignBackground3(shopSignBackground3);
            mlsdHomePage.setShopSignBackground4(shopSignBackground4);

            Object[] updateMlsdHomePageResult = mlsdHomePageService.updateMlsdHomePage(mlsdHomePage);
            json = RetCodeAndMessage.getRetJson(updateMlsdHomePageResult);
            this.renderJson(json.toString(), response);
            return;

        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|MlsdHomPageAction|updateCompanyProfile|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }


    @RequestMapping("/goUpdateMobileHomePage")
    public String goUpdateMobileHomePage(HttpServletRequest request, HttpServletResponse response) {
       /**
        * 方法名称: goUpdateMobileHomePage
        * 描述： 跳转修改麻辣速递首页(移动)
        * 作者: shangyuren
        * 修改日期： 2019/11/20 10:40
        * @param  [request, response] <br>
        */
        try {

            Object[] getMlsdMobileHomePageResult = mlsdHomePageService.getMlsdMobileHomePage();
            if (!RetCodeAndMessage.SUCCESS[0].equals(getMlsdMobileHomePageResult[0])) {
                request.setAttribute("message", getMlsdMobileHomePageResult[2]);
            }
            MlsdMobileHomePageVo mlsdMobileHomePageVo = (MlsdMobileHomePageVo) getMlsdMobileHomePageResult[2];
            String frontPicPath = SystemEnvUtil.getSystemEnv("mlsd_front_server_url") + "pic/";
            request.setAttribute("mlsdMobileHomePageVo", mlsdMobileHomePageVo);
            request.setAttribute("frontPicPath", frontPicPath);
            return "/mlsd/mlsdPage/homePage_mobile";
        } catch (Exception e) {
            hdLog.error("|MlsdHomPageAction|goUpdateMobileHomePage|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }


    @RequestMapping("/updateMlsdMobileHomePage")
    public void updateMlsdMobileHomePage(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateMlsdMobileHomePage
         * 描述： 更新首页配置
         * 作者: shangyuren
         * 修改日期： 2019/11/20 10:40
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Date currentDate = new Date();
            String banner1 = request.getParameter("picPath01");
            String banner21 = request.getParameter("picPath02");
            String text = request.getParameter("text");
            if(StringUtils.isBlank(banner1)||StringUtils.isBlank(banner21)||StringUtils.isBlank(text) ){
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }

            MlsdMobileHomePage mlsdMobileHomePage=new MlsdMobileHomePage();
            mlsdMobileHomePage.setId(new BigInteger(ConstantPoll.MLSD_ID));
            mlsdMobileHomePage.setBanner(banner1);
            mlsdMobileHomePage.setShowImage(banner21);
            mlsdMobileHomePage.setText(text);

            Object[] updateMlsdMobileHomePageResult = mlsdHomePageService.updateMlsdMobileHomePage(mlsdMobileHomePage);
            json = RetCodeAndMessage.getRetJson(updateMlsdMobileHomePageResult);
            this.renderJson(json.toString(), response);
            return;

        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|MlsdHomPageAction|updateMlsdMobileHomePage|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }
}
