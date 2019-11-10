package com.example.feign.Controller;

import com.example.feign.Service.FeignService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/client")
    public String hellowFeign(){
        return feignService.hello();
    }
}
