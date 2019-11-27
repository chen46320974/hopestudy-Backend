package com.example.demo.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.demo.biz.model.User;
import com.example.demo.biz.mapper.UserMapper;
import com.example.demo.biz.model.edit.UserRegisterEditRequest;
import com.example.demo.biz.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.validation.Valid;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaoXinYing
 * @since 2019-11-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Override
    public void registr( @Valid UserRegisterEditRequest request) {
        if(StringUtils.isEmpty(request.getName()) || StringUtils.isEmpty(request.getPhone())
                || StringUtils.isEmpty(request.getPassword())){
            return;
        }
        User user = new User();
        BeanUtils.copyProperties(request,user);
        user.setIntegral(0);
        save(user);
    }

    @Override
    public Integer login(String name, String passWord) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getName,name);
        User user = getOne(queryWrapper);
        if(user == null){
            return null;
        }
        if(!user.getPassword().equals(passWord)){
            return null;
        }
        return user.getId();
    }
}
