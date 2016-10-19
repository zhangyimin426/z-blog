package com.zym.blog.model;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * @author Gavin
 * @date 2016-10-18
 */
public class AdminRole implements Serializable {
    private int adminRoleId;

    private int adminId;

    private int roleId;

    public int getAdminRoleId() {
        return adminRoleId;
    }

    public void setAdminRoleId(int adminRoleId) {
        this.adminRoleId = adminRoleId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return this == null ? null : new Gson().toJson(this);
    }
}
