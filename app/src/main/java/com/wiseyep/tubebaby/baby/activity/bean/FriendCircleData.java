package com.wiseyep.tubebaby.baby.activity.bean;

import java.util.List;

/**
 * Created by XuChengPeng on 2016/8/8.
 * 获取交流圈返回的实体类
 */
public class FriendCircleData {
    private int total;
    private List<FriendCircle> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<FriendCircle> getRows() {
        return rows;
    }

    public void setRows(List<FriendCircle> rows) {
        this.rows = rows;
    }
}
