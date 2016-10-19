package com.zym.blog.dao;

import com.zym.blog.model.PageElement;
import java.util.List;

import com.zym.blog.model.example.PageElementExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PageElementMapper {
    int countByExample(PageElementExample example);

    int deleteByExample(PageElementExample example);

    List<PageElement> selectByExample(PageElementExample example);

    int updateByExampleSelective(@Param("record") PageElement record, @Param("example") PageElementExample example);

    int updateByExample(@Param("record") PageElement record, @Param("example") PageElementExample example);

    List<PageElement> selectByExampleAndPage(PageElementExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Integer pageElementId);

    int insert(PageElement record);

    int insertSelective(PageElement record);

    PageElement selectByPrimaryKey(Integer pageElementId);

    int updateByPrimaryKeySelective(PageElement record);

    int updateByPrimaryKey(PageElement record);
}