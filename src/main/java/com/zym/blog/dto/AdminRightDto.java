package com.zym.blog.dto;

import com.zym.blog.model.Admin;
import com.zym.blog.model.Right;

import java.io.Serializable;
import java.util.Date;

/**
 * 登录用户权限信息dto
 * @author Gavin
 * @date 2016-10-18
 */
public class AdminRightDto implements Serializable {

    private int rightId;

    private int rightType;

    private String rightTypeDesc;

    private String rightName;

    private int menuId;

    private String menuName;

    private String menuUrl;

    private int parentMenuId;

    public int getRightId() {
        return rightId;
    }

    public void setRightId(int rightId) {
        this.rightId = rightId;
    }

    public int getRightType() {
        return rightType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
    }

    public String getRightTypeDesc() {
        return rightTypeDesc;
    }

    public void setRightTypeDesc(String rightTypeDesc) {
        this.rightTypeDesc = rightTypeDesc;
    }

    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public int getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(int parentMenuId) {
        this.parentMenuId = parentMenuId;
    }
}
