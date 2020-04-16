package com.hd.action;

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
import java.math.BigInteger;
import java.util.Date;

@Controller
@RequestMapping("/")
public class MlsdAction extends BaseAction {
    @Autowired
    MlsdService mlsdService;

    @RequestMapping("/goHeader")
    public String goHeader(HttpServletRequest request, HttpServletResponse response){
        MlsdCompanyProfile mlsdCompanyProfileDB = mlsdService.getCompanyProfile();
        request.setAttribute("mlsdCompanyProfile",mlsdCompanyProfileDB);
        MlsdOnlineService mlsdOnlineServiceDB = mlsdService.getMlsdOnlineService();
        request.setAttribute("mlsdOnlineService",mlsdOnlineServiceDB);

        return "header";
    }

    @RequestMapping("/goFooter")
    public String goFooter(HttpServletRequest request, HttpServletResponse response){
        MlsdCompanyProfile mlsdCompanyProfileDB = mlsdService.getCompanyProfile();
        request.setAttribute("mlsdCompanyProfile",mlsdCompanyProfileDB);
        return "footer";
    }

    @RequestMapping("/index")
    public String goIndex(HttpServletRequest request, HttpServletResponse response){
        /**
         * @Author 马兴亮
         * @Description 跳转首页
         * @param request
         * @param response
         * @Date 2019\10\9 0009 8:31
         */
        String currentTime = String.valueOf(new Date().getTime());
        try {
            MlsdHomePage mlsdHomePageDB = mlsdService.getIndex();
            request.setAttribute("mlsdHomePage",mlsdHomePageDB);
            return "index";
        }catch (Exception e){
            hdLog.error("|error|goIndex|" + currentTime + "|", e);
            return "index";
        }
    }

    @RequestMapping("/goBrand.do")
    public String goBrand(HttpServletRequest request, HttpServletResponse response){
        /**
         * @Author 马兴亮
         * @Description 跳转品牌
         * @param request
         * @param response
         * @Date 2019\10\9 0009 8:31
         */
        String currentTime = String.valueOf(new Date().getTime());
        try {
            MlsdBrandCulture mlsdBrandCultureDB = mlsdService.getBrand();
            request.setAttribute("mlsdBrandCulture",mlsdBrandCultureDB);
            return "brand";
        }catch (Exception e){
            hdLog.error("|error|goBrand|" + currentTime + "|", e);
            return "brand";
        }
    }

    @RequestMapping("/goAdvantage.do")
    public String goAdvantage(HttpServletRequest request, HttpServletResponse response){
        /**
         * @Author 马兴亮
         * @Description 项目优势
         * @param request
         * @param response
         * @Date 2019\10\9 0009 8:31
         */
        String currentTime = String.valueOf(new Date().getTime());
        try {
            MlsdItemAdvantage mlsdItemAdvantageDB = mlsdService.getAdvantage();
            request.setAttribute("mlsdItemAdvantage",mlsdItemAdvantageDB);
            return "advantage";
        }catch (Exception e){
            hdLog.error("|error|goAdvantage|" + currentTime + "|", e);
            return "advantage";
        }
    }

    @RequestMapping("/goJoin.do")
    public String goJoin(HttpServletRequest request, HttpServletResponse response){
        /**
         * @Author 马兴亮
         * @Description 招商加盟
         * @param request
         * @param response
         * @Date 2019\10\9 0009 8:31
         */
        String currentTime = String.valueOf(new Date().getTime());
        try {
            MlsdJoinInvestment mlsdJoinInvestmentDB = mlsdService.getJoin();
            request.setAttribute("mlsdJoinInvestment",mlsdJoinInvestmentDB);
            return "join";
        }catch (Exception e){
            hdLog.error("|error|goJoin|" + currentTime + "|", e);
            return "join";
        }
    }

    @RequestMapping("/goProduct.do")
    public String goProduct(HttpServletRequest request, HttpServletResponse response){
        /**
         * @Author 马兴亮
         * @Description 产品介绍
         * @param request
         * @param response
         * @Date 2019\10\9 0009 8:31
         */
        String currentTime = String.valueOf(new Date().getTime());
        try {
            MlsdProductPresentation mlsdProductPresentationDB = mlsdService.getProduct();
            request.setAttribute("mlsdProductPresentation",mlsdProductPresentationDB);
            return "product";
        }catch (Exception e){
            hdLog.error("|error|goProduct|" + currentTime + "|", e);
            return "product";
        }
    }

    @RequestMapping("/goShowShop.do")
    public String goShowShop(HttpServletRequest request, HttpServletResponse response){
        /**
         * @Author 马兴亮
         * @Description 门店展示
         * @param request
         * @param response
         * @Date 2019\10\9 0009 8:31
         */
        String currentTime = String.valueOf(new Date().getTime());
        try {
            MlsdStoreDisplay mlsdStoreDisplayDB = mlsdService.getShowShop();
            request.setAttribute("mlsdStoreDisplay",mlsdStoreDisplayDB);
            return "showShop";
        }catch (Exception e){
            hdLog.error("|error|goShowShop|" + currentTime + "|", e);
            return "showShop";
        }
    }

    @RequestMapping("/goStrength.do")
    public String goStrength(HttpServletRequest request, HttpServletResponse response){
        /**
         * @Author 马兴亮
         * @Description 实力后台
         * @param request
         * @param response
         * @Date 2019\10\9 0009 8:31
         */
        String currentTime = String.valueOf(new Date().getTime());
        try {
            MlsdStrength mlsdStrengthDB = mlsdService.getStrength();
            request.setAttribute("mlsdStrength",mlsdStrengthDB);
            return "strength";
        }catch (Exception e){
            hdLog.error("|error|goStrength|" + currentTime + "|", e);
            return "strength";
        }
    }

    @RequestMapping("/goContact.do")
    public String goContact(HttpServletRequest request, HttpServletResponse response){
        /**
         * @Author 马兴亮
         * @Description 联系我们
         * @param request
         * @param response
         * @Date 2019\10\9 0009 8:31
         */
        String currentTime = String.valueOf(new Date().getTime());
        try {
            MlsdContactUs mlsdContactUsDB = mlsdService.getContact();
            request.setAttribute("mlsdContactUs",mlsdContactUsDB);
            MlsdCompanyProfile mlsdCompanyProfileDB = mlsdService.getCompanyProfile();
            request.setAttribute("mlsdCompanyProfile",mlsdCompanyProfileDB);
            return "contact";
        }catch (Exception e){
            hdLog.error("|error|goContact|" + currentTime + "|", e);
            return "contact";
        }
    }

    @RequestMapping("/addUserInfo")
    public void addUserInfo(HttpServletRequest request, HttpServletResponse response) {
        /**
         * @Author 马兴亮
         * @Description 上传用户信息
         * @param request
         * @param response
         * @Date 2019\10\9 0009 8:31
         */
        JSONObject json;
        String currentTime = String.valueOf(new Date().getTime());
        try {
            String userName = request.getParameter("userName");
            String tel = request.getParameter("tel");
            if(StringUtils.isEmpty(userName)||StringUtils.isEmpty(tel)){
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.USERINFO_NULL);
                this.renderJson(json.toString(), response);
                return;
            }
            MlsdIntendedUsers mlsdIntendedUsers = new MlsdIntendedUsers();
            mlsdIntendedUsers.setUserName(userName);
            mlsdIntendedUsers.setTel(tel);
            mlsdIntendedUsers.setCreateTime(new Date());
            Object[] addUserInfoResult = mlsdService.addUserInfo(mlsdIntendedUsers);
            json = RetCodeAndMessage.getRetJson(addUserInfoResult);
            this.renderJson(json.toString(), response);
            return;
        } catch (Exception e) {
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.NET);
            this.renderJson(json.toString(), response);
            hdLog.error("|error|addUserInfo|" + currentTime + "|", e);
            return;
        }

    }

    @RequestMapping("/addContactMessage")
    public void addContactMessage(HttpServletRequest request, HttpServletResponse response) {
        /**
         * @Author 马兴亮
         * @Description 联系我们模块上传用户信息
         * @param request
         * @param response
         * @Date 2019\10\9 0009 8:31
         */
        JSONObject json;
        String currentTime = String.valueOf(new Date().getTime());
        try {
            String userName = request.getParameter("userName");
            String address = request.getParameter("address");
            String tel = request.getParameter("tel");
            String email = request.getParameter("email");
            String content = request.getParameter("content");
            if(StringUtils.isEmpty(userName)||StringUtils.isEmpty(address)||StringUtils.isEmpty(tel)){
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.USERINFO_NULL_2);
                this.renderJson(json.toString(), response);
                return;
            }
            MlsdContactMessage mlsdContactMessage = new MlsdContactMessage();
            mlsdContactMessage.setUserName(userName);
            mlsdContactMessage.setTel(tel);
            mlsdContactMessage.setAddress(address);
            mlsdContactMessage.setEmail(email);
            mlsdContactMessage.setContent(content);
            mlsdContactMessage.setCreateTime(new Date());
            mlsdContactMessage.setIsRead(ConstantPoll.NO_READ);
            Object[] addContactMessageResult = mlsdService.addContactMessage(mlsdContactMessage);
            json = RetCodeAndMessage.getRetJson(addContactMessageResult);
            this.renderJson(json.toString(), response);
            return;
        } catch (Exception e) {
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.NET);
            this.renderJson(json.toString(), response);
            hdLog.error("|error|addContactMessage|" + currentTime + "|", e);
            return;
        }

    }

}
