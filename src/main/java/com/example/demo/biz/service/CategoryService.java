package com.example.demo.biz.service;

import com.example.demo.biz.model.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.biz.model.edit.CategotyEditResquest;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhaoXinYing
 * @since 2019-11-26
 */
public interface CategoryService extends IService<Category> {


    /**
     * 添加分类
     * @param name
     */
    void addCatefory(String name);

    /**
     * 获取分类列表
     * @return
     */
    List<Category> getCategoryList();

    /**
     * 删除 分类
     * @param id
     */
    void deleteCategory(Integer id);

}
