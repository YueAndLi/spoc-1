package com.edu.spoc.constant;

/**
 * 角色类型枚举
 */
public enum RoleTypeEnum {
    /**
     * 管理员
     */
    ADMIN("管理员", "ADMIN"),
    /**
     * 教师
     */
    TEACHER("教师", "TEACHER"),
    /**
     * 无编辑权教师
     */
    NO_POWER_TEACHER("无编辑权教师", "TEACHER"),
    /**
     * 学生
     */
    STUDENT("学生", "STUDENT"),
    /**
     * 访客
     */
    VISITOR("访客", "VISITOR");
    public String name;
    public String code;

    RoleTypeEnum(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
