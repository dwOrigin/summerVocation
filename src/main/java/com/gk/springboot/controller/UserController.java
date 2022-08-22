package com.gk.springboot.controller;

import com.gk.springboot.utils.R;
import org.springframework.web.bind.annotation.*;

/**
 * 用于项目登录页面接口的调用
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {


    //login函数
    @PostMapping("/login")
    public R login(String username, String password){
        System.err.println("登录接口被调用了。。。");

        //业务逻辑:判断用户名和密码是否为对应数据库表中的数据 如果是 返回成功  否则失败
        return R.ok().data("token","admin");
    }

    //info函数
    @GetMapping("/info")
    public R info(String info){
        System.err.println("获取信息接口被调用了。。。");
        return R.ok().data("roles","[admin]").data("name","admin");
    }



}
