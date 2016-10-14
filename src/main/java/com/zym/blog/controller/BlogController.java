package com.zym.blog.controller;

import com.github.pagehelper.PageHelper;
import com.zym.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gavin
 * @date 2016-09-05
 */
@RestController
@RequestMapping("/article")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/{blogId}", method = RequestMethod.GET)
    public Object get(@PathVariable("blogId") int id) {
        return blogService.getById(id);
    }


    @RequestMapping(value = "", method = RequestMethod.GET)
    public Object getAll(Integer page, Integer perPage) {
        if (page == null) {
            page = 1;
        }
        if (perPage == null) {
            perPage = 4;
        }
        return blogService.getAll(page, perPage);
    }
}
