package com.example.demo.biz.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhaoXinYing
 * @since 2019-11-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Question extends Model<Question> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String content;

    private LocalDateTime createTime;

    /**
     * 0 待解决 1已解决
     */
    private Integer status;

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

    /**
     * 分类名称 （冗余字段 用于查询）
     */
    private String categoryName;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
