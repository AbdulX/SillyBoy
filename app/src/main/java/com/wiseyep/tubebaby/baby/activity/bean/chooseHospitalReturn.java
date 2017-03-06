package com.wiseyep.tubebaby.baby.activity.bean;

/**
 * Created by cph on 16/8/16.
 */
public class chooseHospitalReturn {


    /**
     * chooseHospital_id : 10
     * serverURL : 114.55.28.169:8282
     * patient_id : 1000000
     * uuid : 9dd5defa-45b5-4858-a298-9e0cbd1c0629
     * telephone : 13758273975
     */

    private long chooseHospital_id;
    private String serverURL;
    private String patient_id;
    private String uuid;
    private String telephone;

    public long getChooseHospital_id() {
        return chooseHospital_id;
    }

    public void setChooseHospital_id(long chooseHospital_id) {
        this.chooseHospital_id = chooseHospital_id;
    }

    public String getServerURL() {
        return serverURL;
    }

    public void setServerURL(String serverURL) {
        this.serverURL = serverURL;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
