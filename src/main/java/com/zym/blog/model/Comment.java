package com.zym.blog.model;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    private Integer commentId;

    private String commentMan;

    private Date commentTime;

    private String commentContent;

    private String commentIp;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentMan() {
        return commentMan;
    }

    public void setCommentMan(String commentMan) {
        this.commentMan = commentMan;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentIp() {
        return commentIp;
    }

    public void setCommentIp(String commentIp) {
        this.commentIp = commentIp;
    }

    @Override
    public String toString() {
        return this == null ? null : new Gson().toJson(this);
    }
}