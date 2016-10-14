package com.zym.blog.controller.back;

import com.zym.blog.constant.BaseConstant;
import com.zym.blog.model.Admin;
import com.zym.blog.model.AdminLoginHistory;
import com.zym.blog.service.AdminLoginHistoryService;
import com.zym.blog.service.AdminService;
import com.zym.blog.statuscode.GlobalResultStatus;
import com.zym.blog.utils.DateUtil;
import com.zym.blog.utils.JsonResult;
import com.zym.blog.utils.RequestUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * 管理后台登录和登出
 *
 * @author Gavin
 * @date 2016-10-09
 */
@RestController
@RequestMapping("/session")
public class SessionController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private AdminLoginHistoryService adminLoginHistoryService;

    private static final Logger log = LoggerFactory.getLogger(SessionController.class);

    /**
     * 创建会话（登录）
     *
     * @param loginName 登录用户名
     * @param password  密码
     * @param request   请求
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Object login(String loginName, String password, HttpServletRequest request) {

        //查询帐号信息
        Admin adminResult = adminService.getByLoginName(loginName);
        if (adminResult == null) {
            return JsonResult.fail(GlobalResultStatus.USER_NOT_EXIST);
        }

        //检查密码安全
        if (!DigestUtils.md5Hex(adminResult.getPassword()).equals(password)) {
            return JsonResult.fail(GlobalResultStatus.PASSWORD_ERROR);
        }
        request.getSession().setAttribute(BaseConstant.ADMIN_SESSION, adminResult);

        try {
            recordLoginHistory(request, adminResult.getAdminId());
        } catch (Exception e) {
            log.info("账号【" + loginName + "】记录登录日志失败", e);
        }

        return JsonResult.success(adminResult);
    }

    /**
     * 记录登录日志
     *
     * @param request
     * @param adminId
     */
    private void recordLoginHistory(HttpServletRequest request, Integer adminId) {
        AdminLoginHistory history = new AdminLoginHistory();
        history.setAdminId(adminId);
        history.setLoginTime(DateUtil.getLocalDate(new Date()));
        history.setRemoteIp(RequestUtil.getRemoteAddr(request));
        adminLoginHistoryService.insert(history);
    }

    /**
     * 销毁当前会话（登出）
     *
     * @param session 会话
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public Object logout(HttpSession session) {
        session.removeAttribute(BaseConstant.ADMIN_SESSION);
        return JsonResult.success();
    }

}
