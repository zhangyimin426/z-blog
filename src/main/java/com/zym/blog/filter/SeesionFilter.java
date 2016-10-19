package com.zym.blog.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zym.blog.constant.BaseConstant;
import com.zym.blog.model.Admin;
import com.zym.blog.statuscode.GlobalResultStatus;
import com.zym.blog.utils.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * session管理（使用注解标注过滤器）
 * @WebFilter将一个实现了javax.servlet.Filter接口的类定义为过滤器 属性filterName声明过滤器的名称, 可选
 * 属性urlPatterns指定要过滤的URL模式,也可使用属性value来声明.(指定要过滤的URL模式是必选属性)
 *
 * @author Gavin
 * @date 2016-10-17
 */


@WebFilter(filterName = "sessionFilter", urlPatterns = "/*")
public class SeesionFilter implements Filter {

    private static final Logger log = LoggerFactory.getLogger(SeesionFilter.class);

    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("初始化session过滤器");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        response.setHeader("Access-Control-Allow-Credentials", "true");

        String url = request.getRequestURI();
        HttpSession session = request.getSession();
        log.info(url);
        Admin admin = (Admin) session.getAttribute(BaseConstant.ADMIN_SESSION);
        log.info("-------zblog-------read：session_id:" + request.getSession().getId());
        if (admin != null) {
            log.info("Admin:" + admin.toString());
        }
        if (!url.contains("session")) {
            if (admin == null) {
                log.debug("-------zblog-------admin is null:" + request.getSession().getId());
                writeResponse(response, JsonResult.fail(GlobalResultStatus.USER_LOGIN_SESSION_TIME_OUT));
                return;
            }
        }
        chain.doFilter(request, response);
    }

    private void writeResponse(HttpServletResponse response, Object result) {
        response.setContentType("application/json;charset=UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        try {
            response.getWriter().write(mapper.writeValueAsString(result));
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public void destroy() {
        log.info("摧毁session过滤器");
    }
}
