package com.edu.spoc.model;

import java.io.Serializable;
import java.util.Date;

public class CourseLabel implements Serializable {
    private String id;

    private String labelName;

    private String lableDesc;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName == null ? null : labelName.trim();
    }

    public String getLableDesc() {
        return lableDesc;
    }

    public void setLableDesc(String lableDesc) {
        this.lableDesc = lableDesc == null ? null : lableDesc.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}