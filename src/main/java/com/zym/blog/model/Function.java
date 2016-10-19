package com.zym.blog.model;

import java.io.Serializable;

public class Function implements Serializable {
    private Integer functionId;

    private String functionName;

    private String functionCode;

    private String interceptUrlSuffix;

    private Integer parentFunctionId;

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    public String getInterceptUrlSuffix() {
        return interceptUrlSuffix;
    }

    public void setInterceptUrlSuffix(String interceptUrlSuffix) {
        this.interceptUrlSuffix = interceptUrlSuffix;
    }

    public Integer getParentFunctionId() {
        return parentFunctionId;
    }

    public void setParentFunctionId(Integer parentFunctionId) {
        this.parentFunctionId = parentFunctionId;
    }
}