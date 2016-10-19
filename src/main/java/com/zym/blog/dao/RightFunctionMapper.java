package com.zym.blog.dao;

import com.zym.blog.model.RightFunction;
import java.util.List;

import com.zym.blog.model.example.RightFunctionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RightFunctionMapper {
    int countByExample(RightFunctionExample example);

    int deleteByExample(RightFunctionExample example);

    List<RightFunction> selectByExample(RightFunctionExample example);

    int updateByExampleSelective(@Param("record") RightFunction record, @Param("example") RightFunctionExample example);

    int updateByExample(@Param("record") RightFunction record, @Param("example") RightFunctionExample example);

    List<RightFunction> selectByExampleAndPage(RightFunctionExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Integer rightFunctionId);

    int insert(RightFunction record);

    int insertSelective(RightFunction record);

    RightFunction selectByPrimaryKey(Integer rightFunctionId);

    int updateByPrimaryKeySelective(RightFunction record);

    int updateByPrimaryKey(RightFunction record);
}