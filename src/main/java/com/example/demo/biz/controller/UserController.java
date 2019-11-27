package com.example.demo.biz.controller;


import com.example.demo.biz.model.edit.UserRegisterEditRequest;
import com.example.demo.biz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhaoXinYing
 * @since 2019-11-25
 */
@Validated
@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/register")
    @ResponseBody
    public String register(UserRegisterEditRequest registerEditRequest){
        userService.registr(registerEditRequest);
        return "成功";
    }

}
