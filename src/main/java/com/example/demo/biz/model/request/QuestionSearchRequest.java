package com.example.demo.biz.model.request;

import lombok.Data;

@Data
public class QuestionSearchRequest {

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 关键字
     */
    private String keyWord;
}
