package com.wiseyep.tubebaby.baby.activity.bean;

/**
 * Created by cph on 16/12/21.
 */

public class DrugDetail {//开药详情
    /**
     * id : 1
     * drugImage : 药品名
     * drugConsumption : 用量
     * drugName : 药品名
     * drugAttention : 注意
     * drugVideo : 视频
     * drugEffect : 功能
     */

    private long id;
    private String drugImage;
    private String drugConsumption;
    private String drugName;
    private String drugAttention;
    private String drugVideo;
    private String drugEffect;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDrugImage() {
        return drugImage;
    }

    public void setDrugImage(String drugImage) {
        this.drugImage = drugImage;
    }

    public String getDrugConsumption() {
        return drugConsumption;
    }

    public void setDrugConsumption(String drugConsumption) {
        this.drugConsumption = drugConsumption;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugAttention() {
        return drugAttention;
    }

    public void setDrugAttention(String drugAttention) {
        this.drugAttention = drugAttention;
    }

    public String getDrugVideo() {
        return drugVideo;
    }

    public void setDrugVideo(String drugVideo) {
        this.drugVideo = drugVideo;
    }

    public String getDrugEffect() {
        return drugEffect;
    }

    public void setDrugEffect(String drugEffect) {
        this.drugEffect = drugEffect;
    }

}
