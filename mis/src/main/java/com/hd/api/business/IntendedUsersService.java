package com.hd.api.business;

/**
*@author Robot
*/
public  interface IntendedUsersService {


     Object[] getIntendedUsersList(Integer page, Integer pageSize, String startTime, String endTime) throws Exception;





}