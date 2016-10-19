package com.zym.blog.model;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * @author Gavin
 * @date 2016-10-18
 */
public class Right implements Serializable {
    private int rightId;

    private int rightType;

    private String rightTypeDesc;

    private String rightName;

    public int getRightId() {
        return rightId;
    }

    public void setRightId(int rightId) {
        this.rightId = rightId;
    }

    public int getRightType() {
        return rightType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
    }

    public String getRightTypeDesc() {
        return rightTypeDesc;
    }

    public void setRightTypeDesc(String rightTypeDesc) {
        this.rightTypeDesc = rightTypeDesc;
    }

    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName;
    }

    @Override
    public String toString() {
        return this == null ? null : new Gson().toJson(this);
    }
}
