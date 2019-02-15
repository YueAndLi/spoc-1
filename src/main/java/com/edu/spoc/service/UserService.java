package com.edu.spoc.service;

import com.edu.spoc.vo.LoginVo;
import com.edu.spoc.model.SysUser;

/**
 * 用户查询service
 * @author wjc
 */
public interface UserService {
    /**
     * 验证用户登录信息是否正确
     * @param loginVo loginInfo
     * @return
     *      1 为 验证成功
     *      0 为 验证失败
     */
    SysUser verifyUser(LoginVo loginVo);

    /**
     * 新增用户
     *
     * @param sysUser sysUser
     * @return
     */
    SysUser addUser(SysUser sysUser);

    /**
     * 修改用户
     *
     * @param sysUser sysUser
     * @return
     */
    SysUser updateUser(SysUser sysUser);
}
