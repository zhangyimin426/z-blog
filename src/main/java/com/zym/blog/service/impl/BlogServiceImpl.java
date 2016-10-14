package com.zym.blog.service.impl;

import com.github.pagehelper.PageHelper;
import com.zym.blog.dao.BlogDao;
import com.zym.blog.form.BlogForm;
import com.zym.blog.model.Blog;
import com.zym.blog.model.example.BlogExample;
import com.zym.blog.service.BlogService;
import com.zym.blog.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gavin
 * @date 2016-09-05
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDao blogDao;

    @Override
    public Blog getById(int id) {
        return blogDao.selectByPrimaryKey(id);
    }

    @Override
    public List<Blog> getAll(Integer page, Integer perPage) {
        BlogExample example = new BlogExample();
        PageHelper.startPage(page, perPage);
        return blogDao.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<Blog> getByForm(BlogForm form, Integer page, Integer perPage) {
        BlogExample example = new BlogExample();
        BlogExample.Criteria criteria = example.createCriteria();

        if (form.getBlogId() != null) {
            criteria.andBlogIdEqualTo(form.getBlogId());
        }
        if (!StringUtil.isEmpty(form.getBlogTitle())) {
            criteria.andBlogTitleLike(form.getBlogTitle());
        }
        if (form.getBlogType() != null) {
            criteria.andBlogTypeEqualTo(form.getBlogType());
        }
        if (!StringUtil.isEmpty(form.getBlogLabel())) {
            criteria.andBlogLabelLike(form.getBlogLabel());
        }
        if (!StringUtil.isEmpty(form.getAuthor())) {
            criteria.andAuthorLike(form.getAuthor());
        }
        PageHelper.startPage(page, perPage);
        return blogDao.selectByExampleWithBLOBs(example);
    }

    @Override
    public int insert(Blog blog) {
        return blogDao.insert(blog);
    }

    @Override
    public int updateByPrimaryKey(Blog blog) {
        return blogDao.updateByPrimaryKey(blog);
    }

    @Override
    public int deleteByPrimaryKey(int blogId) {
        return blogDao.deleteByPrimaryKey(blogId);
    }
}
