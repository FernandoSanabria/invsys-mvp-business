package com.invsys.mvpbusiness.domain;

import java.util.List;

public class DomainUser {
    private int id;

    private String name;

    private String email;

    private DomainCompany company;

    private List<DomainRegion> regions;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DomainCompany getCompany() {
        return company;
    }

    public void setCompany(DomainCompany company) {
        this.company = company;
    }

    public List<DomainRegion> getRegions() {
        return regions;
    }

    public void setRegions(List<DomainRegion> regions) {
        this.regions = regions;
    }
}
