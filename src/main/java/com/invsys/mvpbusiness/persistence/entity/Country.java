package com.invsys.mvpbusiness.persistence.entity;


import javax.persistence.*;

@Entity
@Table(name = "country", schema = "public")
public class Country {

    private Integer id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;

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
}
