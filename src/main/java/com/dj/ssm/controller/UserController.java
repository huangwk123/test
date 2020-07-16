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
    String ff = "ffff";
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
    /**
    *否否否
    *
    /
    /**
     * 我是本地分支
     */
    /**
     * 是是是是
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
