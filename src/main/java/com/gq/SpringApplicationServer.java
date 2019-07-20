package com.gq;

import com.gq.dao.model.Userinfos;
import com.gq.service.UserinfosService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@MapperScan("com.gq.dao.mapper")
public class SpringApplicationServer {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationServer.class,args);
    }

    @Autowired
    private UserinfosService userinfosService;
    @RequestMapping("/test")
    public Object test() {
        Userinfos user = new Userinfos();
        userinfosService.insertUserinfos(user);
        return "success";
    }
}

