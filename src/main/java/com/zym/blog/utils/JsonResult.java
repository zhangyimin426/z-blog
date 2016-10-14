package com.zym.blog.utils;

import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;
import com.github.pagehelper.Page;
import com.zym.blog.statuscode.GlobalResultStatus;
import com.zym.blog.statuscode.ResultStatus;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Json结果
 *
 * @author gavin
 * @date 2016-09-28
 */
public class JsonResult {
    /**
     * 返回无数据的成功结果
     *
     * @return JSON结果
     */
    public static Object success() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", GlobalResultStatus.SUCCESS.getCode());
        return map;
    }

    /**
     * 返回成功结果
     *
     * @param data 数据节点对象
     * @return JSON结果
     */
    public static Object success(Object data) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("code", GlobalResultStatus.SUCCESS.getCode());
        map.put("data", data);
        return map;
    }

    /**
     * 返回成功结果
     *
     * @param data 数据节点对象
     * @return JSON结果
     */
    public static Object success(Map<String, Object> data) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", GlobalResultStatus.SUCCESS.getCode());
        map.put("data", data);
        return map;
    }

    /**
     * 返回日期处理成功结果
     *
     * @param data 数据节点对象
     * @return JSON结果
     */
    public static String success(Object data, String format) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", GlobalResultStatus.SUCCESS.getCode());
        if (data != null) {
            map.put("data", data);
        }
        JsonMapper mapper = new JsonMapper(Inclusion.NON_NULL, new SimpleDateFormat(format));
        return mapper.toJson(map);
    }

    /**
     * 返回成功结果
     *
     * @param list 数据列表
     * @return JSON结果
     */
    public static Object success(List<?> list) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("code", GlobalResultStatus.SUCCESS.getCode());
        map.put("data", list);
        return map;
    }

    /**
     * 返回成功结果
     *
     * @param list 数据列表
     * @param page 分页信息
     * @return JSON结果
     */
    public static Object success(List<?> list, Page page) {
        Map<String, Object> map = new HashMap<String, Object>();
        Map<String, Object> subMap = new HashMap<String, Object>();
        subMap.put("list", list);
        subMap.put("pager", page);
        map.put("code", GlobalResultStatus.SUCCESS.getCode());
        map.put("data", subMap);
        return map;
    }

    /**
     * 返回成功结果
     *
     * @param list 数据列表
     * @param page 分页信息
     * @return JSON结果
     */
    public static String success(List<?> list, Page page, String format) {
        Map<String, Object> map = new HashMap<String, Object>();
        Map<String, Object> subMap = new HashMap<String, Object>();
        subMap.put("list", list);
        subMap.put("pager", page);
        map.put("code", GlobalResultStatus.SUCCESS.getCode());
        map.put("data", subMap);
        JsonMapper mapper = new JsonMapper(Inclusion.NON_NULL, new SimpleDateFormat(format));
        return mapper.toJson(map);
    }

    /**
     * 返回失败结果
     *
     * @param status 结果说明信息
     * @return JSON结果
     */
    public static Object fail(ResultStatus status) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", status.getCode());
        map.put("msg", status.getMsg());
        return map;
    }

    /**
     * 返回失败结果
     *
     * @param status 结果说明信息
     * @param data   数据节点对象
     * @return JSON结果
     */
    public static Object fail(ResultStatus status, Object data) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", status.getCode());
        map.put("msg", status.getMsg());
        map.put("data", data);
        return map;
    }
}