package com.hd.common.utils;

/**
 * @Author 马兴亮
 * @Date 2017/6/9 16:29
 * @Description 业务逻辑层向上层返回数据
 */
public class ServiceRetCode {
    public static Object[] returnCode(Object[] objlist, Object... objArray) {
        /**
         * @Author 马兴亮
         * @Date 2017/6/9 16:29
         * @params [objlist 成功失败, objArray可以给上层返回多个参数]
         * @return java.lang.Object[]
         * @Description 业务逻辑层向上层返回数据
         */
        int returnObjListLength = objlist.length;
        if (objArray==null){
            returnObjListLength = returnObjListLength+1;
        }else if (objArray.length > 0) {
            returnObjListLength = returnObjListLength+objArray.length;
        }
        Object[] returnObjList = new Object[returnObjListLength];
        returnObjList[0]=objlist[0];
        returnObjList[1]=objlist[1];
        if (objArray==null){
            returnObjList[2] = null;
        }else if (objArray.length > 0) {
            for (int i = 0; i < objArray.length; i++) {
                if(objArray[i]==null){
                    returnObjList[2 + i] = null;
                }else{
                    returnObjList[2 + i] = objArray[i];
                }

            }
        }
        return returnObjList;
    }

    public static Object[] returnCode(Object[] objlist) {
        return objlist;
    }
}
