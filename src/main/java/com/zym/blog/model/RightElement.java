package com.zym.blog.model;

import java.io.Serializable;

public class RightElement implements Serializable {
    private Integer rightElementId;

    private Integer rightId;

    private Integer pageElementId;

    public Integer getRightElementId() {
        return rightElementId;
    }

    public void setRightElementId(Integer rightElementId) {
        this.rightElementId = rightElementId;
    }

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    public Integer getPageElementId() {
        return pageElementId;
    }

    public void setPageElementId(Integer pageElementId) {
        this.pageElementId = pageElementId;
    }
}