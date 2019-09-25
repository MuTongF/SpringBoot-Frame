package com.jidu.aladdin.common;

import java.util.List;

/**
 * 接受分页信息
 */
public class PageResult<T> {
    /*当前页*/
    private Integer page;
    /*每页条数*/
    private Integer limit;
    /*总条数*/
    private Integer count;
    /*查询到的数据*/
    private List<T> list;

    public static PageResult newInstance(Integer count, List list) {
        return new PageResult(null, null, count, list);
    }

    public PageResult() {
        super();
    }

    public PageResult(Integer page, Integer limit, Integer count, List<T> list) {
        super();
        this.page = page;
        this.limit = limit;
        this.count = count;
        this.list = list;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
