package com.gibbons.common.util;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 查询参数
 */
public class Query extends LinkedHashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    //当前页码
    private int page = 1;

    //每页条数
    private int limit = 10;

    // 排序列
    private String sortRow;

    // 排序方向
    private String sortDire;

    public Query(Map<String, Object> params) {
        this.putAll(params);
        //分页参数
        if (params.get("page") != null) {
            this.page = Integer.parseInt(params.get("page").toString());
            this.remove("page");
        }
        if (params.get("limit") != null) {
            this.limit = Integer.parseInt(params.get("limit").toString());
            this.remove("limit");
        }
        if (params.get("sortRow") != null) {
            this.sortRow = params.get("sortRow").toString();
            this.remove("sortRow");
        }
        if (params.get("sortDire") != null) {
            this.sortDire = params.get("sortDire").toString();
            this.remove("sortDire");
        }
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getSortRow() {
        return sortRow;
    }

    public void setSortRow(String sortRow) {
        this.sortRow = sortRow;
    }

    public String getSortDire() {
        return sortDire;
    }

    public void setSortDire(String sortDire) {
        this.sortDire = sortDire;
    }
}
