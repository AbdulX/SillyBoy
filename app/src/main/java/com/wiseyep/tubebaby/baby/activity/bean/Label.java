package com.wiseyep.tubebaby.baby.activity.bean;

/**
 * Created by cph on 16/8/25.
 * 获取可选的标签
 */
public class Label {

    /**
     * name : 我母鸡啊
     * id : 1
     * type : 0
     * del_flag : 0
     */

    private String name;
    private long id;
    private int type;
    private int del_flag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getDel_flag() {
        return del_flag;
    }

    public void setDel_flag(int del_flag) {
        this.del_flag = del_flag;
    }
}
