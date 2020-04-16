package com.hd.api.business;

import com.hd.entity.generator.MlsdContactMessage;

/**
*@author Robot
*/
public  interface ContactMessageService {


    Object[] getContactMessageList(Integer page, Integer pageSize, String isRead, String userName, String tel);

    Object[] updateContactMessage(MlsdContactMessage mlsdContactMessage);

}