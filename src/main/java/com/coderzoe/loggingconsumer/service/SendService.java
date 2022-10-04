package com.coderzoe.loggingconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

/**
 * @author coderZoe
 * @date 2022/10/4 21:29
 */
@Service
public class SendService {
    private StreamBridge streamBridge;

    public void send(String message){
        streamBridge.send("upperCase-in-0",message);
    }
    @Autowired
    public void setStreamBridge(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }
}
