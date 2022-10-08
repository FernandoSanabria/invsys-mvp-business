package com.invsys.mvpbusiness.domain;

public class DomainOperation {
    private int id;

    private String name;

    private DomainModule module;

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

    public DomainModule getModule() {
        return module;
    }

    public void setModule(DomainModule module) {
        this.module = module;
    }
}
