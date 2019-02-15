package com.edu.spoc.mapper;

import com.edu.spoc.model.CourseSort;
import com.edu.spoc.model.CourseSortExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseSortMapper {
    long countByExample(CourseSortExample example);

    int deleteByExample(CourseSortExample example);

    int insert(CourseSort record);

    int insertSelective(CourseSort record);

    List<CourseSort> selectByExample(CourseSortExample example);

    int updateByExampleSelective(@Param("record") CourseSort record, @Param("example") CourseSortExample example);

    int updateByExample(@Param("record") CourseSort record, @Param("example") CourseSortExample example);
}