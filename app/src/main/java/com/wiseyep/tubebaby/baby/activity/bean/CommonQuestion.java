package com.wiseyep.tubebaby.baby.activity.bean;

/**
 * Created by cph on 16/8/25.
 */
public class CommonQuestion {


    /**
     * id : 1
     * content : 1231232123
     * viewdTimes : 0
     * del_flag : 0
     * answer : 123123123
     * createdDate : 2016-08-25 09:01:34
     */

    private long id;
    private String content;
    private int viewdTimes;
    private int del_flag;
    private String answer;
    private String createdDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getViewdTimes() {
        return viewdTimes;
    }

    public void setViewdTimes(int viewdTimes) {
        this.viewdTimes = viewdTimes;
    }

    public int getDel_flag() {
        return del_flag;
    }

    public void setDel_flag(int del_flag) {
        this.del_flag = del_flag;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
