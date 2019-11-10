package com.example.ribbon.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "clientFallback")
    public String client(){
        return restTemplate.getForEntity("http://EUREKA-CLIENT/",String.class).getBody();
    }

    public String clientFallback(){
        return "error";
    }
}
