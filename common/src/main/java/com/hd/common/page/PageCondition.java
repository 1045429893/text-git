package com.hd.common.page;

import java.io.Serializable;

import org.springframework.util.StringUtils;

public class PageCondition implements Serializable
{
    private static final long serialVersionUID = 1L;

    private String orderBy;//排序字段
    private int page; //起始页
    private int limit = 10; //每页显示条数

    public PageCondition()
    {
        super();
    }

    public PageCondition(int pageIndex, int pageSize, String orderBy)
    {
        this.page = pageIndex;
        this.limit = pageSize;
        this.orderBy = orderBy;
    }

    public int getPage()
    {
        return this.page;
    }

    public void setPage(int page)
    {
        this.page = page;
    }

    public int getrows()
    {
        return this.limit;
    }

    public void setlimit(int rows)
    {
        this.limit = limit;
    }

    public String getOrderBy()
    {
        if (!StringUtils.hasText(this.orderBy))
        {
            this.orderBy = " c_time_stamp desc ";
        }
        return this.orderBy;
    }

    public int getPageIndex()
    {
        return this.page;
    }

    public int getPageSize()
    {
        return this.limit;
    }

    public int getPageSize2()
    {
        return this.limit * 5;
    }

    public void setOrderBy(String orderBy)
    {
        this.orderBy = orderBy;
    }

    public void setPageIndex(int pageIndex)
    {
        this.page = pageIndex;
    }

    public void setPageSize(int pageSize)
    {
        this.limit = pageSize;
    }

    /**
     * 数据库对应每页的起始下标值
     * @return
     */
    public Integer getIndex()
    {
        int index = 0;
        if (this.getPageSize() >= 1 && this.getPageIndex() >= 1)
        {
            index = (this.getPageIndex() - 1) * this.getPageSize();
        }
        return index;
    }

    @Override
    public String toString()
    {
        return "PageInfo [orderBy=" + this.orderBy + ", pageIndex=" + this.page + ", pageSize=" + this.limit + "]";
    }

}
