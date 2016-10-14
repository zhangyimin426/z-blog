package com.zym.blog.dao;

import java.util.List;

import com.zym.blog.model.Like;
import com.zym.blog.model.example.LikeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface LikeDao {

    int countByExample(LikeExample example);

    List<Like> selectByExample(LikeExample example);

    List<Like> selectByExampleAndPage(LikeExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Integer likeId);

    int insert(Like record);

    Like selectByPrimaryKey(Integer likeId);

}