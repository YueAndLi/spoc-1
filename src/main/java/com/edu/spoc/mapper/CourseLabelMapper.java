package com.edu.spoc.mapper;

import com.edu.spoc.model.CourseLabel;
import com.edu.spoc.model.CourseLabelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseLabelMapper {
    long countByExample(CourseLabelExample example);

    int deleteByExample(CourseLabelExample example);

    int insert(CourseLabel record);

    int insertSelective(CourseLabel record);

    List<CourseLabel> selectByExample(CourseLabelExample example);

    int updateByExampleSelective(@Param("record") CourseLabel record, @Param("example") CourseLabelExample example);

    int updateByExample(@Param("record") CourseLabel record, @Param("example") CourseLabelExample example);
}