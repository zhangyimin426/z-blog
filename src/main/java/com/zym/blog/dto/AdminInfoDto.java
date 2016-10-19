package com.zym.blog.dto;

import com.zym.blog.model.Admin;

import java.io.Serializable;
import java.util.List;

/**
 * @author Gavin
 * @date 2016-10-19
 */
public class AdminInfoDto implements Serializable {

    private Admin admin;

    private List<AdminMenuRightDto> menuRightDtos;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<AdminMenuRightDto> getMenuRightDtos() {
        return menuRightDtos;
    }

    public void setMenuRightDtos(List<AdminMenuRightDto> menuRightDtos) {
        this.menuRightDtos = menuRightDtos;
    }
}
