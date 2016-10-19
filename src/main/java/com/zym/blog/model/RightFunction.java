package com.zym.blog.model;

import java.io.Serializable;

public class RightFunction implements Serializable {
    private Integer rightFunctionId;

    private Integer rightId;

    private Integer functionId;

    public Integer getRightFunctionId() {
        return rightFunctionId;
    }

    public void setRightFunctionId(Integer rightFunctionId) {
        this.rightFunctionId = rightFunctionId;
    }

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }
}