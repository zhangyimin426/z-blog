package com.zym.blog.dao;

import com.zym.blog.dto.AdminMenuRightDto;
import com.zym.blog.model.Right;
import java.util.List;

import com.zym.blog.model.example.RightExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface RightMapper {
    int countByExample(RightExample example);

    int deleteByExample(RightExample example);

    List<Right> selectByExample(RightExample example);

    int updateByExampleSelective(@Param("record") Right record, @Param("example") RightExample example);

    int updateByExample(@Param("record") Right record, @Param("example") RightExample example);

    List<Right> selectByExampleAndPage(RightExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Integer rightId);

    int insert(Right record);

    int insertSelective(Right record);

    Right selectByPrimaryKey(Integer rightId);

    int updateByPrimaryKeySelective(Right record);

    int updateByPrimaryKey(Right record);

    //根据用户id获取所有权限
    List<AdminMenuRightDto> getByAdminId(int adminId);
}