package com.zym.blog.model;

import java.io.Serializable;

public class RightFile implements Serializable {
    private Integer rightFileId;

    private Integer rightId;

    private Integer fileId;

    public Integer getRightFileId() {
        return rightFileId;
    }

    public void setRightFileId(Integer rightFileId) {
        this.rightFileId = rightFileId;
    }

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }
}