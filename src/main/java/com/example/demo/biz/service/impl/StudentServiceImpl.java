package com.example.demo.biz.service.impl;

import com.example.demo.biz.model.Student;
import com.example.demo.biz.mapper.StudentMapper;
import com.example.demo.biz.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaoXinYing
 * @since 2019-11-25
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
