package com.example.demo.biz.service.impl;

import com.example.demo.biz.model.Question;
import com.example.demo.biz.mapper.QuestionMapper;
import com.example.demo.biz.service.QuestionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaoXinYing
 * @since 2019-11-26
 */
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements QuestionService {

}
