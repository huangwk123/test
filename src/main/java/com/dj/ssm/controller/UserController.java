package com.dj.ssm.controller;

import com.dj.ssm.pojo.ResultModel;
import com.dj.ssm.pojo.User;
import com.dj.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    String gg = "gggg";
    String dd = "dddd";
    String cc = "cccc";
    String aa = "aaaa";
    String bb = "aaaa";
    /**
     * master
     */
    /**
     * dev
     */
    @Autowired
    private UserService userService;

    @RequestMapping("/insert")
    public ResultModel<Object> insert(User user) {
        try {
        userService.saveUser(user);
        return new ResultModel<>().success(user);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultModel<>().error("服务器异常");
        }


    }
}
