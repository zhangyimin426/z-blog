package com.zym.blog.model.example;

import java.io.Serializable;

/**
 * @author Gavin
 * @date 2016-10-18
 */
public class RightMenu implements Serializable {
    private int rightMenuId;

    private int rightId;

    private int menuId;

    public int getRightMenuId() {
        return rightMenuId;
    }

    public void setRightMenuId(int rightMenuId) {
        this.rightMenuId = rightMenuId;
    }

    public int getRightId() {
        return rightId;
    }

    public void setRightId(int rightId) {
        this.rightId = rightId;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }
}
