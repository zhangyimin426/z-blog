package com.zym.blog.dao;

import com.zym.blog.model.Blog;
import com.zym.blog.model.example.BlogExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @author Gavin
 * @date 2016-09-05
 */
@Mapper
public interface BlogDao {

    int countByExample(BlogExample example);

    int deleteByExample(BlogExample example);

    List<Blog> selectByExampleWithBLOBs(BlogExample example);

    List<Blog> selectByExample(BlogExample example);

    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByExampleWithBLOBs(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);

    List<Blog> selectByExampleWithBLOBsAndPage(BlogExample example, RowBounds rowBound);

    List<Blog> selectByExampleAndPage(BlogExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Integer blogId);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer blogId);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKeyWithBLOBs(Blog record);

    int updateByPrimaryKey(Blog record);
}
