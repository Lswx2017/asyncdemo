package com.jn.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {

    @Scheduled(cron = "0 29/1 15 ? * 0")
    public void scheduledCall() {
        System.out.println("called!");

    }
}
