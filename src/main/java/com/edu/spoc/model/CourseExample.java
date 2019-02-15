package com.edu.spoc.model;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionIsNull() {
            addCriterion("course_introduction is null");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionIsNotNull() {
            addCriterion("course_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionEqualTo(String value) {
            addCriterion("course_introduction =", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotEqualTo(String value) {
            addCriterion("course_introduction <>", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionGreaterThan(String value) {
            addCriterion("course_introduction >", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("course_introduction >=", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionLessThan(String value) {
            addCriterion("course_introduction <", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionLessThanOrEqualTo(String value) {
            addCriterion("course_introduction <=", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionLike(String value) {
            addCriterion("course_introduction like", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotLike(String value) {
            addCriterion("course_introduction not like", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionIn(List<String> values) {
            addCriterion("course_introduction in", values, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotIn(List<String> values) {
            addCriterion("course_introduction not in", values, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionBetween(String value1, String value2) {
            addCriterion("course_introduction between", value1, value2, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotBetween(String value1, String value2) {
            addCriterion("course_introduction not between", value1, value2, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseInfoIsNull() {
            addCriterion("course_info is null");
            return (Criteria) this;
        }

        public Criteria andCourseInfoIsNotNull() {
            addCriterion("course_info is not null");
            return (Criteria) this;
        }

        public Criteria andCourseInfoEqualTo(String value) {
            addCriterion("course_info =", value, "courseInfo");
            return (Criteria) this;
        }

        public Criteria andCourseInfoNotEqualTo(String value) {
            addCriterion("course_info <>", value, "courseInfo");
            return (Criteria) this;
        }

        public Criteria andCourseInfoGreaterThan(String value) {
            addCriterion("course_info >", value, "courseInfo");
            return (Criteria) this;
        }

        public Criteria andCourseInfoGreaterThanOrEqualTo(String value) {
            addCriterion("course_info >=", value, "courseInfo");
            return (Criteria) this;
        }

        public Criteria andCourseInfoLessThan(String value) {
            addCriterion("course_info <", value, "courseInfo");
            return (Criteria) this;
        }

        public Criteria andCourseInfoLessThanOrEqualTo(String value) {
            addCriterion("course_info <=", value, "courseInfo");
            return (Criteria) this;
        }

        public Criteria andCourseInfoLike(String value) {
            addCriterion("course_info like", value, "courseInfo");
            return (Criteria) this;
        }

        public Criteria andCourseInfoNotLike(String value) {
            addCriterion("course_info not like", value, "courseInfo");
            return (Criteria) this;
        }

        public Criteria andCourseInfoIn(List<String> values) {
            addCriterion("course_info in", values, "courseInfo");
            return (Criteria) this;
        }

        public Criteria andCourseInfoNotIn(List<String> values) {
            addCriterion("course_info not in", values, "courseInfo");
            return (Criteria) this;
        }

        public Criteria andCourseInfoBetween(String value1, String value2) {
            addCriterion("course_info between", value1, value2, "courseInfo");
            return (Criteria) this;
        }

        public Criteria andCourseInfoNotBetween(String value1, String value2) {
            addCriterion("course_info not between", value1, value2, "courseInfo");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineIsNull() {
            addCriterion("course_outline is null");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineIsNotNull() {
            addCriterion("course_outline is not null");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineEqualTo(String value) {
            addCriterion("course_outline =", value, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineNotEqualTo(String value) {
            addCriterion("course_outline <>", value, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineGreaterThan(String value) {
            addCriterion("course_outline >", value, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineGreaterThanOrEqualTo(String value) {
            addCriterion("course_outline >=", value, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineLessThan(String value) {
            addCriterion("course_outline <", value, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineLessThanOrEqualTo(String value) {
            addCriterion("course_outline <=", value, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineLike(String value) {
            addCriterion("course_outline like", value, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineNotLike(String value) {
            addCriterion("course_outline not like", value, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineIn(List<String> values) {
            addCriterion("course_outline in", values, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineNotIn(List<String> values) {
            addCriterion("course_outline not in", values, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineBetween(String value1, String value2) {
            addCriterion("course_outline between", value1, value2, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineNotBetween(String value1, String value2) {
            addCriterion("course_outline not between", value1, value2, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseScoreStandardIsNull() {
            addCriterion("course_score_standard is null");
            return (Criteria) this;
        }

        public Criteria andCourseScoreStandardIsNotNull() {
            addCriterion("course_score_standard is not null");
            return (Criteria) this;
        }

        public Criteria andCourseScoreStandardEqualTo(String value) {
            addCriterion("course_score_standard =", value, "courseScoreStandard");
            return (Criteria) this;
        }

        public Criteria andCourseScoreStandardNotEqualTo(String value) {
            addCriterion("course_score_standard <>", value, "courseScoreStandard");
            return (Criteria) this;
        }

        public Criteria andCourseScoreStandardGreaterThan(String value) {
            addCriterion("course_score_standard >", value, "courseScoreStandard");
            return (Criteria) this;
        }

        public Criteria andCourseScoreStandardGreaterThanOrEqualTo(String value) {
            addCriterion("course_score_standard >=", value, "courseScoreStandard");
            return (Criteria) this;
        }

        public Criteria andCourseScoreStandardLessThan(String value) {
            addCriterion("course_score_standard <", value, "courseScoreStandard");
            return (Criteria) this;
        }

        public Criteria andCourseScoreStandardLessThanOrEqualTo(String value) {
            addCriterion("course_score_standard <=", value, "courseScoreStandard");
            return (Criteria) this;
        }

        public Criteria andCourseScoreStandardLike(String value) {
            addCriterion("course_score_standard like", value, "courseScoreStandard");
            return (Criteria) this;
        }

        public Criteria andCourseScoreStandardNotLike(String value) {
            addCriterion("course_score_standard not like", value, "courseScoreStandard");
            return (Criteria) this;
        }

        public Criteria andCourseScoreStandardIn(List<String> values) {
            addCriterion("course_score_standard in", values, "courseScoreStandard");
            return (Criteria) this;
        }

        public Criteria andCourseScoreStandardNotIn(List<String> values) {
            addCriterion("course_score_standard not in", values, "courseScoreStandard");
            return (Criteria) this;
        }

        public Criteria andCourseScoreStandardBetween(String value1, String value2) {
            addCriterion("course_score_standard between", value1, value2, "courseScoreStandard");
            return (Criteria) this;
        }

        public Criteria andCourseScoreStandardNotBetween(String value1, String value2) {
            addCriterion("course_score_standard not between", value1, value2, "courseScoreStandard");
            return (Criteria) this;
        }

        public Criteria andCourseVideoIntroductionIsNull() {
            addCriterion("course_video_introduction is null");
            return (Criteria) this;
        }

        public Criteria andCourseVideoIntroductionIsNotNull() {
            addCriterion("course_video_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andCourseVideoIntroductionEqualTo(String value) {
            addCriterion("course_video_introduction =", value, "courseVideoIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseVideoIntroductionNotEqualTo(String value) {
            addCriterion("course_video_introduction <>", value, "courseVideoIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseVideoIntroductionGreaterThan(String value) {
            addCriterion("course_video_introduction >", value, "courseVideoIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseVideoIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("course_video_introduction >=", value, "courseVideoIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseVideoIntroductionLessThan(String value) {
            addCriterion("course_video_introduction <", value, "courseVideoIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseVideoIntroductionLessThanOrEqualTo(String value) {
            addCriterion("course_video_introduction <=", value, "courseVideoIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseVideoIntroductionLike(String value) {
            addCriterion("course_video_introduction like", value, "courseVideoIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseVideoIntroductionNotLike(String value) {
            addCriterion("course_video_introduction not like", value, "courseVideoIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseVideoIntroductionIn(List<String> values) {
            addCriterion("course_video_introduction in", values, "courseVideoIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseVideoIntroductionNotIn(List<String> values) {
            addCriterion("course_video_introduction not in", values, "courseVideoIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseVideoIntroductionBetween(String value1, String value2) {
            addCriterion("course_video_introduction between", value1, value2, "courseVideoIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseVideoIntroductionNotBetween(String value1, String value2) {
            addCriterion("course_video_introduction not between", value1, value2, "courseVideoIntroduction");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCourseTeachersIsNull() {
            addCriterion("course_teachers is null");
            return (Criteria) this;
        }

        public Criteria andCourseTeachersIsNotNull() {
            addCriterion("course_teachers is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTeachersEqualTo(String value) {
            addCriterion("course_teachers =", value, "courseTeachers");
            return (Criteria) this;
        }

        public Criteria andCourseTeachersNotEqualTo(String value) {
            addCriterion("course_teachers <>", value, "courseTeachers");
            return (Criteria) this;
        }

        public Criteria andCourseTeachersGreaterThan(String value) {
            addCriterion("course_teachers >", value, "courseTeachers");
            return (Criteria) this;
        }

        public Criteria andCourseTeachersGreaterThanOrEqualTo(String value) {
            addCriterion("course_teachers >=", value, "courseTeachers");
            return (Criteria) this;
        }

        public Criteria andCourseTeachersLessThan(String value) {
            addCriterion("course_teachers <", value, "courseTeachers");
            return (Criteria) this;
        }

        public Criteria andCourseTeachersLessThanOrEqualTo(String value) {
            addCriterion("course_teachers <=", value, "courseTeachers");
            return (Criteria) this;
        }

        public Criteria andCourseTeachersLike(String value) {
            addCriterion("course_teachers like", value, "courseTeachers");
            return (Criteria) this;
        }

        public Criteria andCourseTeachersNotLike(String value) {
            addCriterion("course_teachers not like", value, "courseTeachers");
            return (Criteria) this;
        }

        public Criteria andCourseTeachersIn(List<String> values) {
            addCriterion("course_teachers in", values, "courseTeachers");
            return (Criteria) this;
        }

        public Criteria andCourseTeachersNotIn(List<String> values) {
            addCriterion("course_teachers not in", values, "courseTeachers");
            return (Criteria) this;
        }

        public Criteria andCourseTeachersBetween(String value1, String value2) {
            addCriterion("course_teachers between", value1, value2, "courseTeachers");
            return (Criteria) this;
        }

        public Criteria andCourseTeachersNotBetween(String value1, String value2) {
            addCriterion("course_teachers not between", value1, value2, "courseTeachers");
            return (Criteria) this;
        }

        public Criteria andCourseCoverIsNull() {
            addCriterion("course_cover is null");
            return (Criteria) this;
        }

        public Criteria andCourseCoverIsNotNull() {
            addCriterion("course_cover is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCoverEqualTo(String value) {
            addCriterion("course_cover =", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverNotEqualTo(String value) {
            addCriterion("course_cover <>", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverGreaterThan(String value) {
            addCriterion("course_cover >", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverGreaterThanOrEqualTo(String value) {
            addCriterion("course_cover >=", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverLessThan(String value) {
            addCriterion("course_cover <", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverLessThanOrEqualTo(String value) {
            addCriterion("course_cover <=", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverLike(String value) {
            addCriterion("course_cover like", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverNotLike(String value) {
            addCriterion("course_cover not like", value, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverIn(List<String> values) {
            addCriterion("course_cover in", values, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverNotIn(List<String> values) {
            addCriterion("course_cover not in", values, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverBetween(String value1, String value2) {
            addCriterion("course_cover between", value1, value2, "courseCover");
            return (Criteria) this;
        }

        public Criteria andCourseCoverNotBetween(String value1, String value2) {
            addCriterion("course_cover not between", value1, value2, "courseCover");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}