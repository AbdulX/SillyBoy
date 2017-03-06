package com.wiseyep.tubebaby.baby.activity.bean;

/**
 * Created by cph on 16/8/16.
 * 化验列表数据
 */
public class LaboratoryTable {


    /**
     * id : 233
     * results : 1
     * patient_id : 2
     * createdDate : 2016-05-25 20:44:53.0
     */

    private long id;
    private String results;
    private String patient_id;
    private String createdDate;
    private String laboratoryProject;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLaboratoryProject() {
        return laboratoryProject;
    }

    public void setLaboratoryProject(String laboratoryProject) {
        this.laboratoryProject = laboratoryProject;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
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
}
