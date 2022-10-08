package com.invsys.mvpbusiness.domain;

public class DomainZone {
    private int id;

    private String name;

    private DomainRegion region;

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

    public DomainRegion getRegion() {
        return region;
    }

    public void setRegion(DomainRegion region) {
        this.region = region;
    }
}
