package com.coderzoe.loggingconsumer.controller;

import com.coderzoe.loggingconsumer.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author coderZoe
 * @date 2022/10/4 21:31
 */
@RestController
public class SendController {
    private SendService sendService;
    @GetMapping("/send")
    public void send(String message){
        sendService.send(message);
    }

    @Autowired
    public void setSendService(SendService sendService) {
        this.sendService = sendService;
    }
}
