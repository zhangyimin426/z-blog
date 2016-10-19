package com.zym.blog.service;

import com.zym.blog.dto.AdminMenuRightDto;
import com.zym.blog.form.RightForm;
import com.zym.blog.model.Right;

import java.util.List;

/**
 * @author Gavin
 * @date 2016-10-18
 */
public interface RightService {

    List<Right> getListByExample(RightForm form);

    /**
     * @param record
     * @return
     */
    int updateByPrimaryKey(Right record);

    /**
     * @param rightId
     * @return
     */
    int deleteByPrimaryKey(int rightId);

    /**
     * 根据用户id获取所有权限
     * @param adminId
     * @return
     */
    List<AdminMenuRightDto> getByAdminId(int adminId);
}
