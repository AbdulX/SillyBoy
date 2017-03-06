package com.wiseyep.tubebaby.baby.activity.bean;

/**
 * Created by cph on 16/8/16.
 * 药品记录/获取开药记录接口
 */
public class DrugRecords {

    /**
     * id : 506
     * beginTime : 2016-07-11
     * giveTime : 2016-07-11
     * drugName : 感冒药
     * administration : 用药方法
     * frequency : 频率
     * amountOfTime : 一次用量
     * patient_id : 1000000
     * createdDate : 2016-07-11
     * createdBy : null
     */

    private long id;
    private String beginTime;
    private String giveTime;
    private String drugName;
    private String administration;
    private String frequency;
    private String amountOfTime;
    private String patient_id;
    private String createdDate;
    private String createdBy;

    private long punchConfirm_id;//打卡详情id
    private String whetherPunch;//是否确认

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getGiveTime() {
        return giveTime;
    }

    public void setGiveTime(String giveTime) {
        this.giveTime = giveTime;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getAdministration() {
        return administration;
    }

    public void setAdministration(String administration) {
        this.administration = administration;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getAmountOfTime() {
        return amountOfTime;
    }

    public void setAmountOfTime(String amountOfTime) {
        this.amountOfTime = amountOfTime;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public long getPunchConfirm_id() {
        return punchConfirm_id;
    }

    public void setPunchConfirm_id(long punchConfirm_id) {
        this.punchConfirm_id = punchConfirm_id;
    }

    public String getWhetherPunch() {
        return whetherPunch;
    }

    public void setWhetherPunch(String whetherPunch) {
        this.whetherPunch = whetherPunch;
    }
}
