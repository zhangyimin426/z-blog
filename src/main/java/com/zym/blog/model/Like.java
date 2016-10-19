package com.zym.blog.model;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Date;

public class Like implements Serializable {
    private Integer likeId;

    private String likeMan;

    private Date likeTime;

    private String likeIp;

    public Integer getLikeId() {
        return likeId;
    }

    public void setLikeId(Integer likeId) {
        this.likeId = likeId;
    }

    public String getLikeMan() {
        return likeMan;
    }

    public void setLikeMan(String likeMan) {
        this.likeMan = likeMan;
    }

    public Date getLikeTime() {
        return likeTime;
    }

    public void setLikeTime(Date likeTime) {
        this.likeTime = likeTime;
    }

    public String getLikeIp() {
        return likeIp;
    }

    public void setLikeIp(String likeIp) {
        this.likeIp = likeIp;
    }

    @Override
    public String toString() {
        return this == null ? null : new Gson().toJson(this);
    }
}