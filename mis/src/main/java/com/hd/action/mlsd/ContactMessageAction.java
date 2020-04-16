package com.hd.action.mlsd;


import com.hd.api.business.CompanyProfileService;
import com.hd.api.business.ContactMessageService;
import com.hd.common.action.BaseAction;
import com.hd.common.log.hdLog;
import com.hd.entity.business.CompanyProfileVo;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.ContactMessageVo;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.MlsdCompanyProfile;
import com.hd.entity.generator.MlsdContactMessage;
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
 * @Description: 留言
 * @Author: shangYuRen
 * @CreateDate: 2019/10/8 10:05
 */
@Controller
@RequestMapping("mlsd/contactMessage")
public class ContactMessageAction extends BaseAction {
    @Autowired
    ContactMessageService contactMessageService;

    @RequestMapping("/goContactMessage")
    public String goContactMessage(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: goContactMessage
         * 描述： 跳转留言列表
         * 作者: shangyuren
         * 修改日期： 2019/10/8 10:06
         * @param  [request, response] <br>
         */
        try {
            return "/mlsd/contactMessage/contactMessage_list";
        } catch (Exception e) {
            hdLog.error("|ContactMessageAction|goContactMessage|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }

    @RequestMapping("/getContactMessageList")
    public void getContactMessageList(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: getContactMessageList
         * 描述： 获取留言列表
         * 作者: shangyuren
         * 修改日期： 2019/10/8 10:06
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Integer page = StringUtils.isEmpty(request.getParameter("page")) ? 1 : Integer.parseInt(request.getParameter("page"));
            Integer pageSize = StringUtils.isEmpty(request.getParameter("limit")) ? 20 : Integer.parseInt(request.getParameter("limit"));

            String isRead = request.getParameter("isRead");
            String userName = request.getParameter("userName");
            String tel = request.getParameter("tel");


            Object[] getContactMessageListResult = contactMessageService.getContactMessageList(page, pageSize,isRead,userName,tel);
            if (!RetCodeAndMessage.SUCCESS[0].equals(getContactMessageListResult[0])) {
                json = RetCodeAndMessage.getRetJson(getContactMessageListResult);
                renderJson(json.toString(), response);
                return;
            }
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SUCCESS);
            json.put("data", getContactMessageListResult[2]);
            json.put("count", getContactMessageListResult[3]);
            json.put("pageSize", pageSize);
            renderJson(json.toString(), response);
            return;
        } catch (Exception e) {
            hdLog.error("|ContactMessageAction|getContactMessageListResult|" + new Date().getTime(), e);
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            renderJson(json.toString(), response);
            return;
        }
    }

    @RequestMapping("/updateCompanyProfileIsRead")
    public void updateCompanyProfileIsRead(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateCompanyProfileIsRead
         * 描述： 修改留言于都状态
         * 作者: shangyuren
         * 修改日期： 2019/10/8 10:28
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Date currentDate = new Date();
            String id = request.getParameter("id");
            String isReader = request.getParameter("isReader");

            if (StringUtils.isBlank(id) || StringUtils.isBlank(isReader)) {
                this.renderJson(RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER).toString(), response);
                return;
            }
            MlsdContactMessage mlsdContactMessage = new MlsdContactMessage();
            mlsdContactMessage.setId(new BigInteger(id));
            mlsdContactMessage.setIsRead(Integer.parseInt(isReader));
            Object[] updateContactMessageResult = contactMessageService.updateContactMessage(mlsdContactMessage);
            json = RetCodeAndMessage.getRetJson(updateContactMessageResult);
            this.renderJson(json.toString(), response);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|ContactMessageAction|updateContactMessageResult|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }


}
