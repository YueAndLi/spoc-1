package com.edu.spoc.base.model;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * EazyUI 表格返回结果类
 *
 * @author wjc
 */
public class DataGridResult<T> extends SuccessResult {
    /**
     * 总个数
     */
    private long count;
    /**
     * page
     */
    private Page page;
    /**
     * 数据data
     */
    private List<T> data = new ArrayList<>();

    public DataGridResult() {
    }

    public DataGridResult(PageInfo<T> pageInfo) {
        this.data = pageInfo.getList();
        this.count = pageInfo.getTotal();
    }

    @SuppressWarnings("unchecked")
    public DataGridResult build(PageInfo pageInfo) {
        return new DataGridResult(pageInfo);
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
