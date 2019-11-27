package com.example.demo.biz.model.edit;

import lombok.Data;

import java.time.LocalDateTime;


/**
 * 新增 问题表单
 */
@Data
public class QuestionEditRequest {

    /**
     * 问题内容
     */
    private String content;


    /**
     * 发布者id
     */
    private Integer userId;

    /**
     * 悬赏金额
     */
    private Integer money;

    /**
     * 关键字
     */
    private String keyWord;
}
