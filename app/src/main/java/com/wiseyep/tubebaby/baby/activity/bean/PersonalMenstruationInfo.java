package com.wiseyep.tubebaby.baby.activity.bean;

import java.io.Serializable;

/**
 * Created by XuChengPeng on 2016/8/2.
 */
public class PersonalMenstruationInfo implements Serializable {
    private int id;
    private String lastBeginTime;
    private String dayCount;
    private String cycle;
    private String whetherNotification;//0提醒，1不提醒
    private String createdDate;
    private String patient_id;
    private String uuid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastBeginTime() {
        return lastBeginTime;
    }

    public void setLastBeginTime(String lastBeginTime) {
        this.lastBeginTime = lastBeginTime;
    }

    public String getDayCount() {
        return dayCount;
    }

    public void setDayCount(String dayCount) {
        this.dayCount = dayCount;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getWhetherNotification() {
        return whetherNotification;
    }

    public void setWhetherNotification(String whetherNotification) {
        this.whetherNotification = whetherNotification;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
