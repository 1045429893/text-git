package com.hd.common.pool;

import java.util.HashMap;

/**
 * @Author 田伟勋
 * @Date 创建：13:432017/10/12
 * @Description:
 */
public class LogisticsCompanyPool {

    public static final HashMap<String,String> logisticscompany=new HashMap<String,String>(){{
        put("youzhengguonei","邮政包裹/平邮");
        put("ems","EMS");
        put("shunfeng","顺丰");
        put("shentong","申通");
        put("yuantong","圆通");
        put("zhongtong","中通");
        put("huitongkuaidi","百世汇通");
        put("yunda","韵达");
        put("zhaijisong","宅急送");
        put("tiantian","天天");
        put("debangwuliu","德邦");
        put("guotongkuaidi","国通");
        put("ganzhongnengda","能达");
        put("youshuwuliu","优速");
        put("quanfengkuaidi","全峰");
        put("jd","京东");
        put("kuaijiesudi","快捷");
    }};
    public static final HashMap<String,String> logisticsStatus=new HashMap<String,String>(){{
        put("0","快件处于运输过程中");
        put("1","快件已由快递公司揽收");
        put("2","错误");
        put("3","正常签收");
        put("4","货物退回发货人并签收");
        put("5","货物正在进行派件");
        put("6","货物正处于返回发货人的途中");
    }};
}
