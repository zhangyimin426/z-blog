package com.zym.blog.dao;

import com.zym.blog.model.RoleRight;
import com.zym.blog.model.example.RoleRightExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface RoleRightMapper {
    int countByExample(RoleRightExample example);

    int deleteByExample(RoleRightExample example);

    List<RoleRight> selectByExample(RoleRightExample example);

    int updateByExampleSelective(@Param("record") RoleRight record, @Param("example") RoleRightExample example);

    int updateByExample(@Param("record") RoleRight record, @Param("example") RoleRightExample example);

    List<RoleRight> selectByExampleAndPage(RoleRightExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Integer roleRightId);

    int insert(RoleRight record);

    int insertSelective(RoleRight record);

    RoleRight selectByPrimaryKey(Integer roleRightId);

    int updateByPrimaryKeySelective(RoleRight record);

    int updateByPrimaryKey(RoleRight record);
}