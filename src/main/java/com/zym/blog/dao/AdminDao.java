package com.zym.blog.dao;

import java.util.List;

import com.zym.blog.model.Admin;
import com.zym.blog.model.example.AdminExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface AdminDao {
    int countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    List<Admin> selectByExample(AdminExample example);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    List<Admin> selectByExampleAndPage(AdminExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Integer adminId);

    int insert(Admin record);

    Admin selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKey(Admin record);

}