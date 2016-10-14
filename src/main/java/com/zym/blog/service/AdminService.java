package com.zym.blog.service;

import com.zym.blog.form.AdminForm;
import com.zym.blog.model.Admin;

import java.util.List;

/**
 * @author Gavin
 * @date 2016-09-28
 */
public interface AdminService {

    /**
     * 通过登录名获取管理员信息
     *
     * @param loginName 登录名
     * @return 帐号信息
     */
    Admin getByLoginName(String loginName);

    /**
     * 根据条件查询管理员列表
     * @param form
     * @param page
     * @param perPage
     * @return
     */
    List<Admin> getByForm(AdminForm form, Integer page, Integer perPage);

    /**
     *
     * @param admin
     * @return
     */
    int insert(Admin admin);

    /**
     *
     * @param adminId
     * @return
     */
    int deleteByPrimaryKey(int adminId);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Admin record);
}
