package com.edu.spoc.service.impl;

import com.edu.spoc.vo.LoginVo;
import com.edu.spoc.mapper.SysUserMapper;
import com.edu.spoc.model.SysUser;
import com.edu.spoc.model.SysUserExample;
import com.edu.spoc.service.UserService;
import com.edu.spoc.util.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 用户查询service
 *
 * @author wjc
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser verifyUser(LoginVo loginVo) {
        SysUserExample example = new SysUserExample();
        example.createCriteria()
                .andLoginNameEqualTo(loginVo.getUsername())
                .andPassWordEqualTo(loginVo.getPassword());
        List<SysUser> sysUsers = sysUserMapper.selectByExample(example);
        if (!sysUsers.isEmpty() && sysUsers.size() == 1) {
            return sysUsers.get(0);
        }
        return null;
    }

    @Override
    public SysUser addUser(SysUser sysUser) {
        sysUser.setId(StringUtil.generateUUID());
        sysUser.setStatus(0);
        sysUser.setCreateTime(new Date());
        sysUserMapper.insert(sysUser);
        return sysUser;
    }

    @Override
    public SysUser updateUser(SysUser sysUser) {
        sysUser.setLastLoginTime(new Date());
        SysUserExample example = new SysUserExample();
        example.createCriteria().andIdEqualTo(sysUser.getId());
        sysUserMapper.updateByExample(sysUser, example);
        return sysUser;
    }


}
