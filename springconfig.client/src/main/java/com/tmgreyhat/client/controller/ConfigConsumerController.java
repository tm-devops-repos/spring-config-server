package com.tmgreyhat.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/get-token")
public class ConfigConsumerController {


    //importing this value from the config server
    @Value("${EXTERNAL.API.TOKEN}")
    private  String apiToken;
    @GetMapping
    public  String getToken(){

        return  apiToken;
    }
}
