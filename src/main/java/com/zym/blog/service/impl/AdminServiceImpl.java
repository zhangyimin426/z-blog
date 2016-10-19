package com.zym.blog.service.impl;

import com.github.pagehelper.PageHelper;
import com.zym.blog.dao.AdminDao;
import com.zym.blog.form.AdminForm;
import com.zym.blog.model.Admin;
import com.zym.blog.model.example.AdminExample;
import com.zym.blog.service.AdminService;
import com.zym.blog.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gavin
 * @date 2016-10-14
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin getByLoginName(String loginName) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andLoginNameEqualTo(loginName);
        List<Admin> admins = adminDao.selectByExample(example);
        if (admins != null && admins.size() > 0) {
            return admins.get(0);
        }
        return null;
    }

    @Override
    public List<Admin> getByForm(AdminForm form, Integer page, Integer perPage) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        if (form.getAdminId() != null && form.getAdminId() > 0) {
            criteria.andAdminIdNotEqualTo(form.getAdminId());
        }
        if (!StringUtil.isEmpty(form.getLoginName())) {
            criteria.andLoginNameLike(form.getLoginName());
        }
        if (form.getStatus() != null) {
            criteria.andStatusEqualTo(form.getStatus());
        }
        if (!StringUtil.isEmpty(form.getPhone())) {
            criteria.andPhoneLike(form.getPhone());
        }
        if (!StringUtil.isEmpty(form.getEmail())) {
            criteria.andEmailLike(form.getEmail());
        }
        if (!StringUtil.isEmpty(form.getNickName())) {
            criteria.andNickNameLike(form.getNickName());
        }
        PageHelper.startPage(page, perPage);
        return adminDao.selectByExample(example);
    }

    @Override
    public int insert(Admin admin) {
        return adminDao.insert(admin);
    }

    @Override
    public int deleteByPrimaryKey(int adminId) {
        return adminDao.deleteByPrimaryKey(adminId);
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return adminDao.updateByPrimaryKey(record);
    }
}
