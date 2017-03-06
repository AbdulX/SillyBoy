package com.wiseyep.tubebaby.baby.activity.bean;

/**
 * Created by cph on 16/8/17.
 * 特殊情况
 */
public class SpecialCase {


    /**
     * id : 21
     * specialCase : 引起过敏
     * createdBy : 肖志鹏
     * createdDate : 2016-08-17 10:02:15
     */

    private long id;
    private String specialCase;
    private String createdBy;
    private String createdDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSpecialCase() {
        return specialCase;
    }

    public void setSpecialCase(String specialCase) {
        this.specialCase = specialCase;
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
}
