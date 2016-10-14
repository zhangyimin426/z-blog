package com.zym.blog.service.impl;

import com.zym.blog.dao.AdminLoginHistoryDao;
import com.zym.blog.model.AdminLoginHistory;
import com.zym.blog.service.AdminLoginHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Gavin
 * @date 2016-10-14
 */
@Service("adminLoginHistoryService")
public class AdminLoginHistoryServiceImpl implements AdminLoginHistoryService {

    @Autowired
    private AdminLoginHistoryDao adminLoginHistoryDao;

    @Override
    public int insert(AdminLoginHistory adminLoginHistory) {
        return adminLoginHistoryDao.insert(adminLoginHistory);
    }
}
