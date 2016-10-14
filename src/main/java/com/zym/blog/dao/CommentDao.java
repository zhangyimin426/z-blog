package com.zym.blog.dao;

import java.util.List;

import com.zym.blog.model.Comment;
import com.zym.blog.model.example.CommentExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface CommentDao {

    int countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    List<Comment> selectByExample(CommentExample example);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    List<Comment> selectByExampleAndPage(CommentExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Integer commentId);

    int insert(Comment record);

    Comment selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKey(Comment record);
}