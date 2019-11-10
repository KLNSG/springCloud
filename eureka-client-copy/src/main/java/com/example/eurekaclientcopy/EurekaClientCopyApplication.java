package com.example.eurekaclientcopy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class EurekaClientCopyApplication {

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "hellow,word-copy";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientCopyApplication.class, args);
    }

}
