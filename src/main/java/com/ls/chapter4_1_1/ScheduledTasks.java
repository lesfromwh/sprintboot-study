package com.ls.chapter4_1_1;

import org.junit.jupiter.api.Test;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * create by liushuang Date:2017/8/24 Time:10:49
 * 定时任务实现类
 */
@Component
public class ScheduledTasks {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    @Test
//    @Scheduled(fixedRate = 5000)  //上一次开始执行时间点之后5秒再执行
    @Scheduled(fixedDelay = 5000)   //上一次执行完毕时间点之后5秒再执行
    public void reportCurrentTime() {
        System.out.println("现在的时间 : "+simpleDateFormat.format(new Date()));
    }
    //运行启动类.查看效果.
    //quartz 集群
}
