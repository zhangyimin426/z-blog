package com.zym.blog.dao;

import com.zym.blog.model.RightElement;
import java.util.List;

import com.zym.blog.model.example.RightElementExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RightElementMapper {
    int countByExample(RightElementExample example);

    int deleteByExample(RightElementExample example);

    List<RightElement> selectByExample(RightElementExample example);

    int updateByExampleSelective(@Param("record") RightElement record, @Param("example") RightElementExample example);

    int updateByExample(@Param("record") RightElement record, @Param("example") RightElementExample example);

    List<RightElement> selectByExampleAndPage(RightElementExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Integer rightElementId);

    int insert(RightElement record);

    int insertSelective(RightElement record);

    RightElement selectByPrimaryKey(Integer rightElementId);

    int updateByPrimaryKeySelective(RightElement record);

    int updateByPrimaryKey(RightElement record);
}