package com.wiseyep.tubebaby.baby.activity.bean;

/**
 * Created by cph on 16/7/28.
 */
public class Advertisement {

    private long id;
    private String advertisementTitle;
    private String advertisementImage;
    private String advertisementURL;
    private String createdBy;
    private String createdDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdvertisementTitle() {
        return advertisementTitle;
    }

    public void setAdvertisementTitle(String advertisementTitle) {
        this.advertisementTitle = advertisementTitle;
    }

    public String getAdvertisementImage() {
        return advertisementImage;
    }

    public void setAdvertisementImage(String advertisementImage) {
        this.advertisementImage = advertisementImage;
    }

    public String getAdvertisementURL() {
        return advertisementURL;
    }

    public void setAdvertisementURL(String advertisementURL) {
        this.advertisementURL = advertisementURL;
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
