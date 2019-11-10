package com.example.feign.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient("EUREKA-CLIENT")
public interface FeignService {

    @RequestMapping("/")
    String hello();
}
