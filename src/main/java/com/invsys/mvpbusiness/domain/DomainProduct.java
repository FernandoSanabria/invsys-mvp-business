package com.invsys.mvpbusiness.domain;

import javax.persistence.Column;

public class DomainProduct {
    private  int id;

    private String name;

    private String code;

    private String weight;

    private String description;

    private  int daysToFirstExpirationNotification;

    private  int daysToSecondExpirationNotification;

    private  int daysToThirdExpirationNotification;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDaysToFirstExpirationNotification() {
        return daysToFirstExpirationNotification;
    }

    public void setDaysToFirstExpirationNotification(int daysToFirstExpirationNotification) {
        this.daysToFirstExpirationNotification = daysToFirstExpirationNotification;
    }

    public int getDaysToSecondExpirationNotification() {
        return daysToSecondExpirationNotification;
    }

    public void setDaysToSecondExpirationNotification(int daysToSecondExpirationNotification) {
        this.daysToSecondExpirationNotification = daysToSecondExpirationNotification;
    }

    public int getDaysToThirdExpirationNotification() {
        return daysToThirdExpirationNotification;
    }

    public void setDaysToThirdExpirationNotification(int daysToThirdExpirationNotification) {
        this.daysToThirdExpirationNotification = daysToThirdExpirationNotification;
    }
}
