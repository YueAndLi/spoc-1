package com.edu.spoc.mapper;

import com.edu.spoc.model.SysUserInfo;
import com.edu.spoc.model.SysUserInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserInfoMapper {
    long countByExample(SysUserInfoExample example);

    int deleteByExample(SysUserInfoExample example);

    int insert(SysUserInfo record);

    int insertSelective(SysUserInfo record);

    List<SysUserInfo> selectByExample(SysUserInfoExample example);

    int updateByExampleSelective(@Param("record") SysUserInfo record, @Param("example") SysUserInfoExample example);

    int updateByExample(@Param("record") SysUserInfo record, @Param("example") SysUserInfoExample example);
}