package com.zym.blog.model;

import java.io.Serializable;

public class PageElement implements Serializable {
    private Integer pageElementId;

    private String pageElementCode;

    public Integer getPageElementId() {
        return pageElementId;
    }

    public void setPageElementId(Integer pageElementId) {
        this.pageElementId = pageElementId;
    }

    public String getPageElementCode() {
        return pageElementCode;
    }

    public void setPageElementCode(String pageElementCode) {
        this.pageElementCode = pageElementCode;
    }
}