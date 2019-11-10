package com.example.ribbon.Controller;

import com.example.ribbon.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/client")
    public String client(){
        return helloService.client();
    }
}
