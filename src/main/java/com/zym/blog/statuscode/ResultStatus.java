package com.zym.blog.statuscode;

import java.io.Serializable;

/**
 * 结果状态码
 * @author Gavin
 * @date 2016-09-27
 */
public class ResultStatus implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 状态码
	 */
	private int code;
	
	/**
	 * 状态消息
	 */
	private String msg;

	/**
	 * 构造方法
	 * @param code 状态码
	 * @param msg 状态消息
	 */
	public ResultStatus(int code, String msg)
	{
		this.code = code;
		this.msg = msg;
	}
	
	/**
	 * 获得状态码
	 * @return 状态码
	 */
	public int getCode()
	{
		return code;
	}
	
	/**
	 * 获得状态消息
	 * @return 状态消息
	 */
	public String getMsg()
	{
		return msg;
	}
	
	public ResultStatus format(Object... objects )
	{
		msg = String.format(msg, objects);
		return this;
	}
	
}
