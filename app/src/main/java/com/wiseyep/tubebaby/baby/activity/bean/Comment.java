package com.wiseyep.tubebaby.baby.activity.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by XuChengPeng on 2016/8/8.
 * 评论的实体类
 */
public class Comment implements Serializable {
    /**
     * "createdBy": "",
     * "createdDate": "2016-08-05 11:23:55",
     * "updatedBy": "",
     * "id": 35,
     * "mycircle_id": 25,
     * "content": "你",
     * "user_id": 21,
     * "user_name": "",
     * "del_flag": 0,
     * "father_id": -1,
     * "targetUser_id": 21,
     * "targetUser_name": "",
     * "commentList": []
     */
    private String createdBy;
    private String createdDate;
    private String updateBy;
    private int id;
    private int mycircle_id;
    private String content;
    private int user_id;
    private String user_name;
    private int del_flag;
    private int father_id;
    private int targetUser_id;
    private String targetUser_name;
    private List<Comment> commentList;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMycircle_id() {
        return mycircle_id;
    }

    public void setMycircle_id(int mycircle_id) {
        this.mycircle_id = mycircle_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getDel_flag() {
        return del_flag;
    }

    public void setDel_flag(int del_flag) {
        this.del_flag = del_flag;
    }

    public int getFather_id() {
        return father_id;
    }

    public void setFather_id(int father_id) {
        this.father_id = father_id;
    }

    public int getTargetUser_id() {
        return targetUser_id;
    }

    public void setTargetUser_id(int targetUser_id) {
        this.targetUser_id = targetUser_id;
    }

    public String getTargetUser_name() {
        return targetUser_name;
    }

    public void setTargetUser_name(String targetUser_name) {
        this.targetUser_name = targetUser_name;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}
