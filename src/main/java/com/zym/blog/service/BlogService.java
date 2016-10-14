package com.zym.blog.service;


import com.zym.blog.form.BlogForm;
import com.zym.blog.model.Blog;

import java.util.List;

/**
 * @author Gavin
 * @date 2016-09-05
 */
public interface BlogService {

    /**
     * 根据博客id获取详情
     * @param id
     * @return
     */
    Blog getById(int id);

    /**
     *
     * @return
     */
    List<Blog> getAll(Integer page, Integer perPage);

    /**
     *
     * @param form
     * @param page
     * @param perPage
     * @return
     */
    List<Blog> getByForm(BlogForm form, Integer page, Integer perPage);

    /**
     *
     * @param blog
     * @return
     */
    int insert (Blog blog);

    /**
     * 根据博客id修改
     * @param blog
     * @return
     */
    int updateByPrimaryKey(Blog blog);

    /**
     * 根据博客主键删除
     * @param blogId
     * @return
     */
    int deleteByPrimaryKey(int blogId);
}
