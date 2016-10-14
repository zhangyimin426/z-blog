package com.zym.blog.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * HttpServletRequest 工具
 * @author Gavin
 * @date 2016-10-09
 */
public class RequestUtil
{
	/**
     * 获取客户端IP地址，此方法用在proxy环境中
     * @param request
     * @return IP
     */
	public static String getRemoteAddr(HttpServletRequest request) {
		String ip = request.getHeader("X-Forwarded-For");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		if (ip.indexOf('.') == -1)
            ip = "127.0.0.1";
		return ip;
	}
	 /*public static String getRemoteAddr(HttpServletRequest req) 
	    {
	        String ip = req.getHeader("X-Forwarded-For");
	        if(StringUtil.isNotEmpty(ip))
	        {
	            String[] ips = ip.split(",");
	            if(ips!=null){
	                for(String tmpip : ips)
	                {
	                    if(StringUtil.isEmpty(tmpip))
	                        continue;
	                    tmpip = tmpip.trim();
	                    if(StringUtil.isIP(tmpip) && !tmpip.startsWith("10.") && !tmpip.startsWith("192.168.") && !"127.0.0.1".equals(tmpip))
	                    {
	                        return tmpip.trim();
	                    }
	                }
	            }
	        }
	        ip = req.getHeader("x-real-ip");
	        if(StringUtil.isNotEmpty(ip))
	        {
	        	if(StringUtil.isIP(ip))
	                return ip;
	        }
	        ip = req.getRemoteAddr();
	        if(ip.indexOf('.')==-1)
	            ip = "127.0.0.1";
	        return ip;
	    }*/
    
    /**
     * 获得项目路径名
     * @param request 客户端请求对象
     * @return 项目路径名，如：/ProjectName
     */
    public static String getContextPath(HttpServletRequest request)
    {
        return request.getContextPath();
    }
    
    /**
     * 获得项目基础路径，如果是非80端口，则包含端口。
     * @param request 客户端请求对象
     * @return 项目基础路径，如：http://localhost/ProjectName
     */
    public static String getBasePath(HttpServletRequest request)
    {
        StringBuilder basePath = new StringBuilder(30);
        basePath.append(request.getScheme()).append("://").append(request.getServerName());
        int port = request.getServerPort();
        if (port != 80)
        {
            basePath.append(":").append(request.getServerPort());
        }
        basePath.append(request.getContextPath());
        
        return basePath.toString();
    }

    /**
     * 获得项目所在localhost的基础路径，如果是非80端口，则包含端口。
     * @param request 客户端请求对象
     * @return 项目基础路径，如：http://localhost/ProjectName
     */
    public static String getLocalhostPath(HttpServletRequest request)
    {
        StringBuilder basePath = new StringBuilder(30);
        basePath.append(request.getScheme()).append("://").append("localhost");
        int port = request.getServerPort();
        if (port != 80)
        {
            basePath.append(":").append(request.getServerPort());
        }
        basePath.append(request.getContextPath());
        
        return basePath.toString();
    }

    /**
     * 获得项目域名路径，如果是非80端口，则包含端口。
     * @param request 客户端请求对象
     * @return 项目域名，如：http://www.baidu.com
     */
    public static String getDomain(HttpServletRequest request)
    {
        StringBuilder basePath = new StringBuilder(30);
        basePath.append(request.getScheme()).append("://").append(request.getServerName());
        int port = request.getServerPort();
        if (port != 80)
        {
            basePath.append(":").append(request.getServerPort());
        }
        
        return basePath.toString();
    }
}
