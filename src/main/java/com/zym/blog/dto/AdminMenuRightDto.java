package com.zym.blog.dto;

import com.zym.blog.model.Admin;
import com.zym.blog.model.Right;

import java.io.Serializable;
import java.util.Date;

/**
 * 登录用户菜单权限信息dto
 * @author Gavin
 * @date 2016-10-18
 */
public class AdminMenuRightDto implements Serializable {

    private Integer rightId;

    private Integer rightType;

    private String rightTypeDesc;

    private String rightName;

    private Integer menuId;

    private String menuName;

    private String menuUrl;

    private Integer parentMenuId;

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    public Integer getRightType() {
        return rightType;
    }

    public void setRightType(Integer rightType) {
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

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
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

    public Integer getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(Integer parentMenuId) {
        this.parentMenuId = parentMenuId;
    }
}
