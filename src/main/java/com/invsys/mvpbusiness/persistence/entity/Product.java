package com.invsys.mvpbusiness.persistence.entity;
import javax.persistence.*;

@Entity
@Table(name = "product", schema = "public")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String code;

    private String weight;

    private String description;

    @Column(name = "first_expiration_notification")
    private Integer firstExpirationNotification;

    @Column(name = "second_expiration_notification")
    private Integer secondExpirationNotification;

    @Column(name = "third_expiration_notification")
    private Integer thirdExpirationNotification;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getFirstExpirationNotification() {
        return firstExpirationNotification;
    }

    public void setFirstExpirationNotification(Integer firstExpirationNotification) {
        this.firstExpirationNotification = firstExpirationNotification;
    }

    public Integer getSecondExpirationNotification() {
        return secondExpirationNotification;
    }

    public void setSecondExpirationNotification(Integer secondExpirationNotification) {
        this.secondExpirationNotification = secondExpirationNotification;
    }

    public Integer getThirdExpirationNotification() {
        return thirdExpirationNotification;
    }

    public void setThirdExpirationNotification(Integer thirdExpirationNotification) {
        this.thirdExpirationNotification = thirdExpirationNotification;
    }
}
