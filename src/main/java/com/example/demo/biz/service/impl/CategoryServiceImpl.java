package com.example.demo.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.demo.biz.model.Category;
import com.example.demo.biz.mapper.CategoryMapper;
import com.example.demo.biz.model.edit.CategotyEditResquest;
import com.example.demo.biz.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaoXinYing
 * @since 2019-11-26
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Override
    public void addCatefory(String name) {
        if(StringUtils.isEmpty(name)){
            return;
        }
        Category category = new Category();
        category.setName(name);
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.orderByDesc(Category::getSort);
        List<Category> categoryList =list(queryWrapper);
        Integer sort = 1;
        if(!CollectionUtils.isEmpty(categoryList)){
            sort = categoryList.get(0).getSort();
        }
        category.setSort(sort);
        save(category);

    }

    @Override
    public List<Category> getCategoryList() {
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.orderByDesc(Category::getSort);
        List<Category> categoryList =list(queryWrapper);
        return categoryList;
    }

    @Override
    public void deleteCategory(Integer id) {
        Category category = getById(id);
        if(category == null){
            return;
        }
        removeById(id);
    }
}
