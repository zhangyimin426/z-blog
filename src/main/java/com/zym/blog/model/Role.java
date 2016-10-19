package com.zym.blog.model;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * @author Gavin
 * @date 2016-10-18
 */
public class Role implements Serializable {

    private int roleId;

    private String roleName;

    private String roleDesc;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    @Override
    public String toString() {
        return this == null ? null : new Gson().toJson(this);
    }
}
