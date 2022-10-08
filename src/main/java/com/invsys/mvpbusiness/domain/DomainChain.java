package com.invsys.mvpbusiness.domain;


public class DomainChain {
    private int id;

    private String name;

    private DomainCountry country;

    public DomainCountry getCountry() {
        return country;
    }

    public void setCountry(DomainCountry country) {
        this.country = country;
    }

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


}
