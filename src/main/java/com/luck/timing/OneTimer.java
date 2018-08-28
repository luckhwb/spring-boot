package com.luck.timing;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Hua wb on 2018/8/28.
 * 去掉component即可
 */
//@Component
public class OneTimer {
    @Scheduled(fixedRate = 1000)
    public void printHello(){
        System.out.println("Hello Timer.");
    }
}
