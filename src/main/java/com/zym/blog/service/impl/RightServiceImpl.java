package com.zym.blog.service.impl;

import com.zym.blog.dao.RightMapper;
import com.zym.blog.form.RightForm;
import com.zym.blog.model.Right;
import com.zym.blog.service.RightService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Gavin
 * @date 2016-10-18
 */
public class RightServiceImpl implements RightService {

    @Autowired
    private RightMapper rightMapper;

    @Override
    public List<Right> getListByExample(RightForm form) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Right record) {
        return rightMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey(int rightId) {
        return rightMapper.deleteByPrimaryKey(rightId);
    }
}
