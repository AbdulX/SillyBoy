package com.wiseyep.tubebaby.baby.activity.bean;

/**
 * Created by cph on 16/8/25.
 */
public class Question {


    /**
     * id : 12
     * specialQuestion : 111
     * user_id : 1
     * del_flag : 0
     * answer : 123
     * is_answer : 1
     * createdDate : 2016-08-25 16:50:03
     */

    private long id;
    private String specialQuestion;
    private long user_id;
    private int del_flag;
    private String answer;
    private int is_answer;
    private int commonQuestion;
    private String createdDate;

    public int getCommonQuestion() {
        return commonQuestion;
    }

    public void setCommonQuestion(int commonQuestion) {
        this.commonQuestion = commonQuestion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSpecialQuestion() {
        return specialQuestion;
    }

    public void setSpecialQuestion(String specialQuestion) {
        this.specialQuestion = specialQuestion;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
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

    public int getIs_answer() {
        return is_answer;
    }

    public void setIs_answer(int is_answer) {
        this.is_answer = is_answer;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
