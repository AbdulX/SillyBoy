package com.wiseyep.tubebaby.baby.activity.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by cph on 16/7/7.
 */
public class User implements Serializable {

    /**
     * id : 15
     * telephone : 13777402617
     * createdDate : 2016-07-27 13:58:11.0
     * husbandName :
     * husbandPhone :
     * husbandIDCard :
     * wifeName :
     * wifePhone :
     * wifeIDCard :
     * patient_id : 2000001
     * headPortrait :
     * emergencyContactList : []
     */

    private long id;
    private String uuid;
    private String telephone;
    private String createdDate;
    private String chooseHospital_id;
    private String nickName;
    private String husbandName;
    private String husbandPhone;
    private String husbandIDCard;
    private String wifeName;
    private String wifePhone;
    private String wifeIDCard;
    private String patient_id;
    private String headPortrait;
    private String serverURL;
    private List<EmergencyContact> emergencyContactList;


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getChooseHospital_id() {
        return chooseHospital_id;
    }

    public void setChooseHospital_id(String chooseHospital_id) {
        this.chooseHospital_id = chooseHospital_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getHusbandName() {
        return husbandName;
    }

    public void setHusbandName(String husbandName) {
        this.husbandName = husbandName;
    }

    public String getHusbandPhone() {
        return husbandPhone;
    }

    public void setHusbandPhone(String husbandPhone) {
        this.husbandPhone = husbandPhone;
    }

    public String getHusbandIDCard() {
        return husbandIDCard;
    }

    public void setHusbandIDCard(String husbandIDCard) {
        this.husbandIDCard = husbandIDCard;
    }

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }

    public String getWifePhone() {
        return wifePhone;
    }

    public void setWifePhone(String wifePhone) {
        this.wifePhone = wifePhone;
    }

    public String getWifeIDCard() {
        return wifeIDCard;
    }

    public void setWifeIDCard(String wifeIDCard) {
        this.wifeIDCard = wifeIDCard;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    public String getServerURL() {
        return serverURL;
    }

    public void setServerURL(String serverURL) {
        this.serverURL = serverURL;
    }

    public List<EmergencyContact> getEmergencyContactList() {
        return emergencyContactList;
    }

    public void setEmergencyContactList(List<EmergencyContact> emergencyContactList) {
        this.emergencyContactList = emergencyContactList;
    }
}
