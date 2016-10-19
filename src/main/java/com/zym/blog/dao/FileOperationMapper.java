package com.zym.blog.dao;


import java.util.List;

import com.zym.blog.model.FileOperation;
import com.zym.blog.model.example.FileOperationExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FileOperationMapper {
    int countByExample(FileOperationExample example);

    int deleteByExample(FileOperationExample example);

    List<FileOperation> selectByExample(FileOperationExample example);

    int updateByExampleSelective(@Param("record") FileOperation record, @Param("example") FileOperationExample example);

    int updateByExample(@Param("record") FileOperation record, @Param("example") FileOperationExample example);

    List<FileOperation> selectByExampleAndPage(FileOperationExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Integer fileId);

    int insert(FileOperation record);

    int insertSelective(FileOperation record);

    FileOperation selectByPrimaryKey(Integer fileId);

    int updateByPrimaryKeySelective(FileOperation record);

    int updateByPrimaryKey(FileOperation record);
}