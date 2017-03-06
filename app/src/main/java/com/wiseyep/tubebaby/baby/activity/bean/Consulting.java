package com.wiseyep.tubebaby.baby.activity.bean;

/**
 * Created by cph on 16/7/28.
 */
public class Consulting {//在线咨询

    /**
     * commonQuestionId : 3
     * userName : admin
     * power : 0
     * nickName : 1
     */
    private long id;
    private String question;
    private String logo;
    private long commonQuestionId;
    private String userName;
    private int power;
    private String nickName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public long getCommonQuestionId() {
        return commonQuestionId;
    }

    public void setCommonQuestionId(long commonQuestionId) {
        this.commonQuestionId = commonQuestionId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
