package com.example.demo.biz.service;

import com.example.demo.biz.model.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.biz.model.edit.UserRegisterEditRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhaoXinYing
 * @since 2019-11-25
 */
public interface UserService extends IService<User> {


    /**
     *学生注册
     */
    void registr(UserRegisterEditRequest request);

    /**
     * 用户登录 用户登录 成功则返回用户id
     * 前端可以做直接保存用户id 作为token 访问数据
     * @param name
     * @param passWord
     * @return
     */
    Integer login(String name,String passWord);


}
