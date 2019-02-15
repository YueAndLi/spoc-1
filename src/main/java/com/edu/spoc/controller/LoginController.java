package com.edu.spoc.controller;

import com.edu.spoc.vo.LoginVo;
import com.edu.spoc.base.model.Result;
import com.edu.spoc.model.SysUser;
import com.edu.spoc.service.UserService;
import com.edu.spoc.util.ValidateCodeUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 登录controller
 */
@RestController
public class LoginController extends BaseController {
    @Resource
    private UserService userService;

    /**
     * 验证用户登录
     *
     * @param loginVo 用户信息
     * @return result
     */
    @RequestMapping("/login")
    public Result login(@Valid LoginVo loginVo) {
        // 校验验证码
        boolean flag = ValidateCodeUtil.checkCode(loginVo.getVerificationCode(), session);
        if (!flag) {
            return error(409, "验证码错误");
        }
        SysUser sysUser = userService.verifyUser(loginVo);
        if (sysUser != null) {
            // 登录后操作
            afterLogin(sysUser);
            return success();
        } else {
            return error(409, "用户名密码错误");
        }
    }

    @RequestMapping(value = "/generatorImage", method = RequestMethod.GET)
    public void generatorImage() {
        ValidateCodeUtil.getRandcode(session, resp);
    }

    /**
     * 登录后操作
     * 存储用户信息session
     * 修改最后登录时间
     *
     * @param sysUser sysUser
     */
    private void afterLogin(SysUser sysUser) {
        // 登录成功设置登录信息session
        session.setAttribute("login_user", sysUser);
        // 修改最后登录时间
        userService.updateUser(sysUser);
    }


}
