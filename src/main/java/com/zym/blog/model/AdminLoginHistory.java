package com.zym.blog.model;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Date;

public class AdminLoginHistory implements Serializable {
    private Integer adminId;

    private Date loginTime;

    private String remoteIp;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getRemoteIp() {
        return remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }

    @Override
    public String toString() {
        return this == null ? null : new Gson().toJson(this);
    }
}