package com.edu.spoc.model;

import java.io.Serializable;

public class Course implements Serializable {
    private String id;

    private String courseName;

    private String courseIntroduction;

    private String courseInfo;

    private String courseOutline;

    private String courseScoreStandard;

    private String courseVideoIntroduction;

    private Integer status;

    private String courseTeachers;

    private String courseCover;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getCourseIntroduction() {
        return courseIntroduction;
    }

    public void setCourseIntroduction(String courseIntroduction) {
        this.courseIntroduction = courseIntroduction == null ? null : courseIntroduction.trim();
    }

    public String getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(String courseInfo) {
        this.courseInfo = courseInfo == null ? null : courseInfo.trim();
    }

    public String getCourseOutline() {
        return courseOutline;
    }

    public void setCourseOutline(String courseOutline) {
        this.courseOutline = courseOutline == null ? null : courseOutline.trim();
    }

    public String getCourseScoreStandard() {
        return courseScoreStandard;
    }

    public void setCourseScoreStandard(String courseScoreStandard) {
        this.courseScoreStandard = courseScoreStandard == null ? null : courseScoreStandard.trim();
    }

    public String getCourseVideoIntroduction() {
        return courseVideoIntroduction;
    }

    public void setCourseVideoIntroduction(String courseVideoIntroduction) {
        this.courseVideoIntroduction = courseVideoIntroduction == null ? null : courseVideoIntroduction.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCourseTeachers() {
        return courseTeachers;
    }

    public void setCourseTeachers(String courseTeachers) {
        this.courseTeachers = courseTeachers == null ? null : courseTeachers.trim();
    }

    public String getCourseCover() {
        return courseCover;
    }

    public void setCourseCover(String courseCover) {
        this.courseCover = courseCover == null ? null : courseCover.trim();
    }
}