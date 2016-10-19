package com.zym.blog.dao;

import com.zym.blog.model.RightMenu;
import java.util.List;

import com.zym.blog.model.example.RightMenuExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RightMenuMapper {
    int countByExample(RightMenuExample example);

    int deleteByExample(RightMenuExample example);

    List<RightMenu> selectByExample(RightMenuExample example);

    int updateByExampleSelective(@Param("record") RightMenu record, @Param("example") RightMenuExample example);

    int updateByExample(@Param("record") RightMenu record, @Param("example") RightMenuExample example);

    List<RightMenu> selectByExampleAndPage(RightMenuExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Integer rightMenuId);

    int insert(RightMenu record);

    int insertSelective(RightMenu record);

    RightMenu selectByPrimaryKey(Integer rightMenuId);

    int updateByPrimaryKeySelective(RightMenu record);

    int updateByPrimaryKey(RightMenu record);
}