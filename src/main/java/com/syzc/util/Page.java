package com.syzc.util;

import java.util.LinkedList;
import java.util.List;

public class Page<T> {
    /**
     * pageNo start from 1
     */
    Integer pageNo;
    Integer maxPageNo;
    Long totalRows;
    Integer pageSize;
    /**
     * rowOffset start from 0
     */
    Long rowOffset;
    List<T> list = new LinkedList<>();

    public Page(Long totalRows) {
        this.totalRows = totalRows;
    }

    public Page() {
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getMaxPageNo() {
        return maxPageNo;
    }

    public void setMaxPageNo(Integer maxPageNo) {
        this.maxPageNo = maxPageNo;
    }

    public Long getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Long totalRows) {
        this.totalRows = totalRows;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isFirstPage() {
        return pageNo == 1;
    }

    public boolean isLastPage() {
        return pageNo.equals(maxPageNo);
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    /**
     * rowno从0开始计数
     *
     * @return 行号
     */
    public Long getRowOffset() {
        return rowOffset;
    }

    public void setRowOffset(Long rowOffset) {
        this.rowOffset = rowOffset;
    }
}