package com.edu.spoc.mapper;

import com.edu.spoc.model.SysProclamation;
import com.edu.spoc.model.SysProclamationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysProclamationMapper {
    long countByExample(SysProclamationExample example);

    int deleteByExample(SysProclamationExample example);

    int insert(SysProclamation record);

    int insertSelective(SysProclamation record);

    List<SysProclamation> selectByExample(SysProclamationExample example);

    int updateByExampleSelective(@Param("record") SysProclamation record, @Param("example") SysProclamationExample example);

    int updateByExample(@Param("record") SysProclamation record, @Param("example") SysProclamationExample example);
}