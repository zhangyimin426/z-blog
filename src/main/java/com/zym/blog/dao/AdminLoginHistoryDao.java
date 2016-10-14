package com.zym.blog.dao;

import com.zym.blog.model.AdminLoginHistory;
import com.zym.blog.model.example.AdminLoginHistoryExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface AdminLoginHistoryDao {

    List<AdminLoginHistory> selectByExample(AdminLoginHistoryExample example);

    List<AdminLoginHistory> selectByExampleAndPage(AdminLoginHistoryExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Integer adminId);

    int insert(AdminLoginHistory record);

    AdminLoginHistory selectByPrimaryKey(Integer adminId);

}