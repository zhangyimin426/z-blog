package com.zym.blog.dao;

import com.zym.blog.model.RightFile;
import java.util.List;

import com.zym.blog.model.example.RightFileExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RightFileMapper {
    int countByExample(RightFileExample example);

    int deleteByExample(RightFileExample example);

    List<RightFile> selectByExample(RightFileExample example);

    int updateByExampleSelective(@Param("record") RightFile record, @Param("example") RightFileExample example);

    int updateByExample(@Param("record") RightFile record, @Param("example") RightFileExample example);

    List<RightFile> selectByExampleAndPage(RightFileExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Integer rightFileId);

    int insert(RightFile record);

    int insertSelective(RightFile record);

    RightFile selectByPrimaryKey(Integer rightFileId);

    int updateByPrimaryKeySelective(RightFile record);

    int updateByPrimaryKey(RightFile record);
}