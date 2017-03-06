package com.wiseyep.tubebaby.baby.activity.bean;

import java.util.List;

/**
 * Created by XuChengPeng on 2016/7/27.
 * 获取 section和对应的 row的实体类
 */
public class ScienceListData {
    private int id;
    private String section;
    private String createdBy;
    private String createdDate;
    private List<ScienceArticle> scienceRowList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
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

    public List<ScienceArticle> getScienceRowList() {
        return scienceRowList;
    }

    public void setScienceRowList(List<ScienceArticle> scienceRowList) {
        this.scienceRowList = scienceRowList;
    }
}
