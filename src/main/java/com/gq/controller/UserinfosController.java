package com.gq.controller;

import com.gq.dao.model.Userinfos;
import com.gq.service.UserinfosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserinfosController {

    @Autowired
    private UserinfosService userinfosService;

    @RequestMapping(value = "/insertUser")
    public Object insertUser( Userinfos userinfos) {
        userinfosService.insertUserinfos(userinfos);
        return "ok";
    }

}
