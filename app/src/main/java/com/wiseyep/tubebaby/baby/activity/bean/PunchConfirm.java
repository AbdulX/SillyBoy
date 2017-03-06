package com.wiseyep.tubebaby.baby.activity.bean;

import java.util.List;

/**
 * Created by cph on 16/8/17.
 * 打卡详情
 */
public class PunchConfirm {

    /**
     * id : 21
     * whetherSpecialCase : 0
     * specialCase : 特殊情况
     * specialInstructions : 特殊说明
     * punchDrugList : [{"id":21,"drugName":"药品名","whetherPunch":"0","punchConfirm_id":"21","createdDate":"2016-08-17 09:38:19.0","createdBy":"创建者"},{"id":22,"drugName":"药品名","whetherPunch":"1","punchConfirm_id":"21","createdDate":"2016-08-17 09:38:19.0","createdBy":"创建者"}]
     * patient_id : 1000000
     * appointmentDate: "2016-08-27 00:00:00",
     * beginCOHDate: "2016-08-26 10:23:02",
     * createdBy : 创建者
     * createdDate : 2016-08-17 09:38:19.0
     */

    private long id;
    private String whetherSpecialCase;//是否有特殊情况
    private String specialCase;
    private String specialInstructions;
    private String patient_id;
    private String createdBy;
    private String createdDate;
    private String appointmentDate;
    private String beginCOHDate;
    private List<DrugRecords> punchDrugList;

    public String getBeginCOHDate() {
        return beginCOHDate;
    }

    public void setBeginCOHDate(String beginCOHDate) {
        this.beginCOHDate = beginCOHDate;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWhetherSpecialCase() {
        return whetherSpecialCase;
    }

    public void setWhetherSpecialCase(String whetherSpecialCase) {
        this.whetherSpecialCase = whetherSpecialCase;
    }

    public String getSpecialCase() {
        return specialCase;
    }

    public void setSpecialCase(String specialCase) {
        this.specialCase = specialCase;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
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

    public List<DrugRecords> getPunchDrugList() {
        return punchDrugList;
    }

    public void setPunchDrugList(List<DrugRecords> punchDrugList) {
        this.punchDrugList = punchDrugList;
    }

}
