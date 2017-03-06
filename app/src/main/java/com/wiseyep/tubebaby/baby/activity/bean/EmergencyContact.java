package com.wiseyep.tubebaby.baby.activity.bean;

/**
 * Created by XuChengPeng on 2016/7/19.
 */
public class EmergencyContact {

    /**
     * id : 7
     * name : 测试
     * relationship : 关系
     * phoneNumber : 11111111111
     * createdDate : 2016-08-09 17:16:26.0
     * uuid : 565e6dee-820f-470c-8531-b351dfcc0c67
     */

    private int id;
    private String name;
    private String relationship;
    private String phoneNumber;
    private String createdDate;
    private String uuid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
