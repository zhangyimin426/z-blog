package com.zym.blog.model;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Gavin
 * @date 2016-09-02
 */
public class Blog implements Serializable {

    private Integer blogId; //博客id主键

    private String blogTitle;//博客标题

    private String blogContent;//博客内容

    private Integer blogType;//博客类型

    private String blogLabel;//博客标签

    private String author;//作者

    private Date createTime;//创建时间

    private Date updateTime;//更新时间

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public Integer getBlogType() {
        return blogType;
    }

    public void setBlogType(Integer blogType) {
        this.blogType = blogType;
    }

    public String getBlogLabel() {
        return blogLabel;
    }

    public void setBlogLabel(String blogLabel) {
        this.blogLabel = blogLabel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return this == null ? null : new Gson().toJson(this);
    }
}
