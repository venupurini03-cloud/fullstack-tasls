package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consume")
public class ConsumerController {
	@Autowired
	private consumerService consumerService;

    @GetMapping("/message")
    public String consumeMessage() {
        return consumerService.getMessagefromProducer();
    }

    @GetMapping("/error")
    public String consumeError() {
        return consumerService.getErrorfromProducer();
    }


}
