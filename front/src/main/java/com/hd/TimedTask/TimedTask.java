package com.hd.TimedTask;

import com.hd.api.business.TimedTaskService;
import com.hd.common.log.hdLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TimedTask {
    @Autowired
    TimedTaskService timedTaskService;
//    0 0 0 1 0 1 * 每周周一执行
    @Scheduled(cron = "0/30 * * * * ? ") // 间隔5秒执行
    public void taskCycle() {
//        try {
//            System.out.println("定时任务开始");
//            timedTaskService.cleanImage();
//            System.out.println("定时任务结束");
//        } catch (Exception e) {
//            e.printStackTrace();
//            hdLog.error("|error|TimedTask|" + new Date().getTime() + "|", e);
//        }
    }


}
