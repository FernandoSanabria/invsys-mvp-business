package com.invsys.mvpbusiness.domain;
import java.util.List;

public class DomainStore {
    private int id;

    private String name;

    private String address;

    private DomainChain chain;

    private Integer idZone;

    private List<DomainUser> salesRepresentatives;

    private List<DomainUser> brandRepresentatives;

    private List<DomainUser> supervisors;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DomainChain getChain() {
        return chain;
    }

    public void setChain(DomainChain chain) {
        this.chain = chain;
    }

    public Integer getIdZone() {
        return idZone;
    }

    public void setIdZone(Integer idZone) {
        this.idZone = idZone;
    }

    public List<DomainUser> getSalesRepresentatives() {
        return salesRepresentatives;
    }

    public void setSalesRepresentatives(List<DomainUser> salesRepresentatives) {
        this.salesRepresentatives = salesRepresentatives;
    }

    public List<DomainUser> getBrandRepresentatives() {
        return brandRepresentatives;
    }

    public void setBrandRepresentatives(List<DomainUser> brandRepresentatives) {
        this.brandRepresentatives = brandRepresentatives;
    }

    public List<DomainUser> getSupervisors() {
        return supervisors;
    }

    public void setSupervisors(List<DomainUser> supervisors) {
        this.supervisors = supervisors;
    }
}
