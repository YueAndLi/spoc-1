package com.edu.spoc.mapper;

import com.edu.spoc.model.UserCourses;
import com.edu.spoc.model.UserCoursesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserCoursesMapper {
    long countByExample(UserCoursesExample example);

    int deleteByExample(UserCoursesExample example);

    int insert(UserCourses record);

    int insertSelective(UserCourses record);

    List<UserCourses> selectByExample(UserCoursesExample example);

    int updateByExampleSelective(@Param("record") UserCourses record, @Param("example") UserCoursesExample example);

    int updateByExample(@Param("record") UserCourses record, @Param("example") UserCoursesExample example);
}