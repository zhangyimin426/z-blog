package com.zym.blog.model;

import java.io.Serializable;

public class RightMenu implements Serializable {
    private Integer rightMenuId;

    private Integer rightId;

    private Integer menuId;

    public Integer getRightMenuId() {
        return rightMenuId;
    }

    public void setRightMenuId(Integer rightMenuId) {
        this.rightMenuId = rightMenuId;
    }

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}