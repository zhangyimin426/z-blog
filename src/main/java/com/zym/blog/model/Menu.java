package com.zym.blog.model;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * @author Gavin
 * @date 2016-10-18
 */
public class Menu implements Serializable {
    private int menuId;

    private String menuName;

    private String menuUrl;

    private int parentMenuId;

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

    @Override
    public String toString() {
        return this == null ? null : new Gson().toJson(this);
    }
}
