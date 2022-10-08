package com.invsys.mvpbusiness.domain;


public class DomainRegion {
    private Integer id;

    private String name;

    private DomainCompany company;

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

    public DomainCompany getCompany() {
        return company;
    }

    public void setCompany(DomainCompany company) {
        this.company = company;
    }
}
