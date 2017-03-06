package com.wiseyep.tubebaby.baby.activity.bean;

/**
 * Created by cph on 16/8/26.
 */
public class ChildBirthStatus {


    /**
     * sex : 2
     * weight : 2
     * child_birth_feel : 2
     * createdDate : 2016-08-25 08:14:33
     * malformation
     * randomAccessId : 2
     */

    private int sex;
    private int weight;
    private int child_birth_feel;
    private int if_malInformation;
    private String malInformation;
    private long randomAccessId;

    public int getIf_malInformation() {
        return if_malInformation;
    }

    public void setIf_malInformation(int if_malInformation) {
        this.if_malInformation = if_malInformation;
    }

    public String getMalInformation() {
        return malInformation;
    }

    public void setMalInformation(String malInformation) {
        this.malInformation = malInformation;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getChild_birth_feel() {
        return child_birth_feel;
    }

    public void setChild_birth_feel(int child_birth_feel) {
        this.child_birth_feel = child_birth_feel;
    }

    public long getRandomAccessId() {
        return randomAccessId;
    }

    public void setRandomAccessId(long randomAccessId) {
        this.randomAccessId = randomAccessId;
    }
}
