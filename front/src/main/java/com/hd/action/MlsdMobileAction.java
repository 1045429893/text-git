package com.hd.action;

import com.hd.api.business.MlsdMobileService;
import com.hd.api.business.MlsdService;
import com.hd.common.action.BaseAction;
import com.hd.common.log.hdLog;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.*;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Controller
@RequestMapping("/mobile")
public class MlsdMobileAction extends BaseAction {
    @Autowired
    MlsdService mlsdService;
    @Autowired
    MlsdMobileService mlsdMobileService;

    @RequestMapping("/goHeader")
    public String goHeader(HttpServletRequest request, HttpServletResponse response){
        MlsdCompanyProfile mlsdCompanyProfileDB = mlsdService.getCompanyProfile();
        request.setAttribute("mlsdCompanyProfile",mlsdCompanyProfileDB);
        MlsdOnlineService mlsdOnlineServiceDB = mlsdService.getMlsdOnlineService();
        request.setAttribute("mlsdOnlineService",mlsdOnlineServiceDB);

        return "mobile/header";
    }

    @RequestMapping("/goFooter")
    public String goFooter(HttpServletRequest request, HttpServletResponse response){
        MlsdCompanyProfile mlsdCompanyProfileDB = mlsdService.getCompanyProfile();
        request.setAttribute("mlsdCompanyProfile",mlsdCompanyProfileDB);
        return "mobile/footer";
    }

    @RequestMapping("/index")
    public String goIndex(HttpServletRequest request, HttpServletResponse response){
        /**
         * 方法名称: goIndex
         * 描述： 跳首页（移动版）
         * 作者: shangyuren
         * 修改日期： 2019/11/21 15:10
         * @param  [request, response] <br>
         */
        String currentTime = String.valueOf(new Date().getTime());
        try {
            MlsdMobileHomePage mlsdMobileHomePageDB = mlsdMobileService.getIndex();
            request.setAttribute("mlsdMobileHomePage",mlsdMobileHomePageDB);
            return "mobile/index";
        }catch (Exception e){
            hdLog.error("|error|goIndex|" + currentTime + "|", e);
            return "mobile/index";
        }
    }

    @RequestMapping("/goBrand.do")
    public String goBrand(HttpServletRequest request, HttpServletResponse response){
        /**
         * 方法名称: goBrand
         * 描述： 跳转品牌（移动版）
         * 作者: shangyuren
         * 修改日期： 2019/11/21 15:27
         * @param  [request, response] <br>
         */
        String currentTime = String.valueOf(new Date().getTime());
        try {
            MlsdMobileBrandCulture mlsdMobileBrandCultureDB = mlsdMobileService.getBrand();
            request.setAttribute("mlsdMobileBrandCulture",mlsdMobileBrandCultureDB);
            return "mobile/brand";
        }catch (Exception e){
            hdLog.error("|error|goBrand|" + currentTime + "|", e);
            return "mobile/brand";
        }
    }

    @RequestMapping("/goAdvantage.do")
    public String goAdvantage(HttpServletRequest request, HttpServletResponse response){
        /**
         * 方法名称: goAdvantage
         * 描述： 项目优势（移动版）
         * 作者: shangyuren
         * 修改日期： 2019/11/21 15:27
         * @param  [request, response] <br>
         */
        String currentTime = String.valueOf(new Date().getTime());
        try {
            MlsdMobileItemAdvantage mlsdMobileItemAdvantageDB = mlsdMobileService.getAdvantage();
            request.setAttribute("mlsdMobileItemAdvantage",mlsdMobileItemAdvantageDB);
            return "mobile/advantage";
        }catch (Exception e){
            hdLog.error("|error|goAdvantage|" + currentTime + "|", e);
            return "mobile/advantage";
        }
    }

    @RequestMapping("/goJoin.do")
    public String goJoin(HttpServletRequest request, HttpServletResponse response){
        /**
         * 方法名称: goJoin
         * 描述： 招商加盟（移动版）
         * 作者: shangyuren
         * 修改日期： 2019/11/21 15:26
         * @param  [request, response] <br>
         */
        String currentTime = String.valueOf(new Date().getTime());
        try {
            MlsdMobileJoinInvestment mlsdMobileJoinInvestmentDB = mlsdMobileService.getJoin();
            request.setAttribute("mlsdMobileJoinInvestment",mlsdMobileJoinInvestmentDB);
            return "mobile/join";
        }catch (Exception e){
            hdLog.error("|error|goJoin|" + currentTime + "|", e);
            return "mobile/join";
        }
    }

    @RequestMapping("/goProduct.do")
    public String goProduct(HttpServletRequest request, HttpServletResponse response){
        /**
         * 方法名称: goProduct
         * 描述： 产品介绍（移动版）
         * 作者: shangyuren
         * 修改日期： 2019/11/21 15:26
         * @param  [request, response] <br>
         */
        String currentTime = String.valueOf(new Date().getTime());
        try {
            MlsdMobileProductPresentation mlsdMobileProductPresentationDB = mlsdMobileService.getProduct();
            request.setAttribute("mlsdMobileProductPresentation",mlsdMobileProductPresentationDB);
            return "mobile/product";
        }catch (Exception e){
            hdLog.error("|error|goProduct|" + currentTime + "|", e);
            return "mobile/product";
        }
    }

    @RequestMapping("/goShowShop.do")
    public String goShowShop(HttpServletRequest request, HttpServletResponse response){
        /**
         * 方法名称: goShowShop
         * 描述： 门店展示（移动版）
         * 作者: shangyuren
         * 修改日期： 2019/11/21 15:26
         * @param  [request, response] <br>
         */
        String currentTime = String.valueOf(new Date().getTime());
        try {
            MlsdMobileStoreDisplay mlsdMobileStoreDisplayDB = mlsdMobileService.getShowShop();
            request.setAttribute("mlsdMobileStoreDisplay",mlsdMobileStoreDisplayDB);
            return "mobile/showShop";
        }catch (Exception e){
            hdLog.error("|error|goShowShop|" + currentTime + "|", e);
            return "mobile/showShop";
        }
    }

    @RequestMapping("/goStrength.do")
    public String goStrength(HttpServletRequest request, HttpServletResponse response){
      /**
       * 方法名称: goStrength
       * 描述： 实力后台（移动版）
       * 作者: shangyuren
       * 修改日期： 2019/11/21 15:26
       * @param  [request, response] <br>
       */
        String currentTime = String.valueOf(new Date().getTime());
        try {
            MlsdMobileStrength mlsdMobileStrengthDB = mlsdMobileService.getStrength();
            request.setAttribute("mlsdMobileStrength",mlsdMobileStrengthDB);
            return "mobile/strength";
        }catch (Exception e){
            hdLog.error("|error|goStrength|" + currentTime + "|", e);
            return "mobile/strength";
        }
    }

    @RequestMapping("/goContact.do")
    public String goContact(HttpServletRequest request, HttpServletResponse response){
        /**
         * 方法名称: goContact
         * 描述： 联系我们(移动版)
         * 作者: shangyuren
         * 修改日期： 2019/11/21 15:25
         * @param  [request, response] <br>
         */
        String currentTime = String.valueOf(new Date().getTime());
        try {
            MlsdMobileContactUs mlsdMobileContactUsDB = mlsdMobileService.getContact();
            request.setAttribute("mlsdMobileContactUs",mlsdMobileContactUsDB);
            MlsdCompanyProfile mlsdCompanyProfileDB = mlsdService.getCompanyProfile();
            request.setAttribute("mlsdCompanyProfile",mlsdCompanyProfileDB);
            return "mobile/contact";
        }catch (Exception e){
            hdLog.error("|error|goContact|" + currentTime + "|", e);
            return "mobile/contact";
        }
    }

}
