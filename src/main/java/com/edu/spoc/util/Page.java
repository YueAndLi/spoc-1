package com.edu.spoc.util;

import javax.validation.constraints.Min;

/**
 * DataTables 分页工具
 *
 * @author wanjc
 */
public class Page {
    @Min(0)
    private int start;
    private int end;
    @Min(1)
    private int length;
    private int pageNum;
    private int pageSize;

    public Page buildPage() {
        this.pageNum = (start + 1) / length + 1;
        this.pageSize = length;
        this.end = start + length;
        return this;
    }

    public Page() {
    }

    public Page(int start, int length) {
        this.start = start;
        this.length = length;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
