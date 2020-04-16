package com.hd.api.business;

import com.hd.entity.generator.*;
import org.springframework.stereotype.Service;


/**
* @Description:    定时任务
* @Author:         shangYuRen
* @CreateDate:     2019/10/12 13:53
*/
@Service
public  interface TimedTaskService {

    void cleanImage();

}