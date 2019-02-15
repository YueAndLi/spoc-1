package com.edu.spoc.base.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BaseMapper<T, P> {
    long countByExample(P example);

    int deleteByExample(P example);

    int deleteByPrimaryKey(String id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(P example);

    T selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") P example);

    int updateByExample(@Param("record") T record, @Param("example") P example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
