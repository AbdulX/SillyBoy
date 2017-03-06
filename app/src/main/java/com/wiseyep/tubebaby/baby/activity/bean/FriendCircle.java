package com.wiseyep.tubebaby.baby.activity.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by XuChengPeng on 2016/8/8.
 * 朋友圈的实体类
 */
public class FriendCircle implements Serializable {
    /**
     * "createdBy": "",
     * "createdDate": "2016-08-08 11:26:33",
     * "updatedBy": "",
     * "id": 31,
     * "content": "考虑考虑",
     * "reportStatus": "0",
     * "count": "0",
     * "user_id": 19,
     * "user_name": "",
     * "like_num": 0,
     * "pic_url": "http://tubebaby.b0.upaiyun.com/tubebaby/19_1470626786357.jpg",
     * "del_flag": 0,
     * "is_report": 0,
     * "is_like": 0,
     * "commentList": []
     */
    private String createdBy;
    private String createdDate;
    private String updateBy;
    private int id;
    private String content;
    private String reportStatus;
    private String count;
    private int user_id;
    private String user_name;
    private int like_num;
    private String pic_url;
    private int del_flag;
    private int is_report;
    private int is_like;
    private int is_attention;
    private User user;
    private List<Comment> commentList;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getIs_attention() {
        return is_attention;
    }

    public void setIs_attention(int is_attention) {
        this.is_attention = is_attention;
    }

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
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

    public int getLike_num() {
        return like_num;
    }

    public void setLike_num(int like_num) {
        this.like_num = like_num;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public int getDel_flag() {
        return del_flag;
    }

    public void setDel_flag(int del_flag) {
        this.del_flag = del_flag;
    }

    public int getIs_report() {
        return is_report;
    }

    public void setIs_report(int is_report) {
        this.is_report = is_report;
    }

    public int getIs_like() {
        return is_like;
    }

    public void setIs_like(int is_like) {
        this.is_like = is_like;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}
