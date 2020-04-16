package com.hd.action.mlsd;


import com.hd.api.business.MlsdContactUsService;
import com.hd.api.business.MlsdonLineServiceService;
import com.hd.common.action.BaseAction;
import com.hd.common.log.hdLog;
import com.hd.common.utils.SystemEnvUtil;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.MlsdContactUsVo;
import com.hd.entity.business.MlsdOnlineServiceVo;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.MlsdContactUs;
import com.hd.entity.generator.MlsdOnlineService;
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
* @Description:    在线客服图标
* @Author:         shangYuRen
* @CreateDate:     2019/10/10 15:08
*/
@Controller
@RequestMapping("mlsd/online")
public class MlsdOnLineAction extends BaseAction {
    @Autowired
    MlsdonLineServiceService mlsdonLineServiceService;

    @RequestMapping("/goUpdateOnlineService")
    public String goUpdateOnlineService(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: goUpdateOnlineService
         * 描述：跳转热线图标
         * 作者: shangyuren
         * 修改日期： 2019/10/9 15:47
         * @param  [request, response] <br>
         */
        try {

            Object[] getMlsdonlineResult = mlsdonLineServiceService.getMlsdonline();
            if (!RetCodeAndMessage.SUCCESS[0].equals(getMlsdonlineResult[0])) {
                request.setAttribute("message", getMlsdonlineResult[2]);
            }
            MlsdOnlineServiceVo mlsdOnlineServiceVo = (MlsdOnlineServiceVo) getMlsdonlineResult[2];
            String frontPicPath = SystemEnvUtil.getSystemEnv("mlsd_front_server_url") + "pic/";
            request.setAttribute("mlsdOnlineServiceVo", mlsdOnlineServiceVo);
            request.setAttribute("frontPicPath", frontPicPath);
            return "/mlsd/mlsdPage/onlineService";
        } catch (Exception e) {
            hdLog.error("|MlsdOnLineAction|goUpdateOnlineService|" + new Date().getTime(), e);
            request.setAttribute("message", RetCodeAndMessage.SERVER_ERROR[1]);
            return "500";
        }
    }


    @RequestMapping("/updateMlsdOnlineService")
    public void updateMlsdOnlineService(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 方法名称: updateMlsdOnlineService
         * 描述：
         * 作者: shangyuren
         * 修改日期： 2019/10/9 15:46
         * @param  [request, response] <br>
         */
        JSONObject json;
        try {
            Date currentDate = new Date();
            String onlineIconLeft = request.getParameter("picPath01");
            String onlineIconRight = request.getParameter("picPath02");

            if (StringUtils.isBlank(onlineIconLeft) || StringUtils.isBlank(onlineIconRight)) {
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }
            MlsdOnlineService mlsdOnlineService = new MlsdOnlineService();
            mlsdOnlineService.setId(new BigInteger(ConstantPoll.MLSD_ID));
            mlsdOnlineService.setOnlineIconLeft(onlineIconLeft);
            mlsdOnlineService.setOnlineIconRight(onlineIconRight);

            Object[] updateMlsdContactUsResult = mlsdonLineServiceService.updateMlsdonline(mlsdOnlineService);
            json = RetCodeAndMessage.getRetJson(updateMlsdContactUsResult);
            this.renderJson(json.toString(), response);
            return;

        } catch (Exception e) {
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            hdLog.error("|MlsdOnLineAction|updateMlsdOnlineService|" + new Date().getTime(), e);
            this.renderJson(json.toString(), response);
            return;
        }
    }


}
