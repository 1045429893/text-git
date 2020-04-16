package com.hd.action.mlsd;


import com.hd.api.business.IntendedUsersService;
import com.hd.common.action.BaseAction;
import com.hd.common.log.hdLog;
import com.hd.entity.business.RetCodeAndMessage;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
* @Description:    意向用户
* @Author:         shangYuRen
* @CreateDate:     2019/10/10 17:24
*/
@Controller
@RequestMapping("mlsd/intendedUsers")
public class IntendedUsersAction extends BaseAction {
    @Autowired
    IntendedUsersService intendedUsersService;

    @RequestMapping("/goIntendedUsers")
    public String goIntendedUsers(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: goIntendedUsers
         * 描述： 意向用户
         * 作者: shangyuren
         * 修改日期： 2019/10/10 17:25
         * @param  [request, response] <br>
         */
        try {
            return "/mlsd/intendedUsers/intendedUsers_list";
        } catch (Exception e) {
            hdLog.error("|IntendedUsersAction|goIntendedUsers|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }

    @RequestMapping("/getIntendedUsersList")
    public void getIntendedUsersList(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: getIntendedUsersList
         * 描述： 获取意向用户列表
         * 作者: shangyuren
         * 修改日期： 2019/10/8 10:06
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Integer page = StringUtils.isEmpty(request.getParameter("page")) ? 1 : Integer.parseInt(request.getParameter("page"));
            Integer pageSize = StringUtils.isEmpty(request.getParameter("limit")) ? 20 : Integer.parseInt(request.getParameter("limit"));
            String startTime = request.getParameter("startTime");
            String endTime = request.getParameter("endTime");

            Object[] getIntendedUsersListResult = intendedUsersService.getIntendedUsersList(page, pageSize,startTime,endTime);
            if (!RetCodeAndMessage.SUCCESS[0].equals(getIntendedUsersListResult[0])) {
                json = RetCodeAndMessage.getRetJson(getIntendedUsersListResult);
                renderJson(json.toString(), response);
                return;
            }
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SUCCESS);
            json.put("data", getIntendedUsersListResult[2]);
            json.put("count", getIntendedUsersListResult[3]);
            json.put("pageSize", pageSize);
            renderJson(json.toString(), response);
            return;
        } catch (Exception e) {
            hdLog.error("|IntendedUsersAction|getIntendedUsersList|" + new Date().getTime(), e);
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            renderJson(json.toString(), response);
            return;
        }
    }


}
