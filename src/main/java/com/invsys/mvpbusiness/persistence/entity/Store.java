package com.invsys.mvpbusiness.persistence.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "store", schema = "public")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String address;

    @Column(name = "id_chain")
    private Integer idChain;

    @Column(name = "id_zone")
    private Integer idZone;

    @OneToMany(mappedBy = "store", cascade = {CascadeType.ALL})
    private List<UserStore> representatives;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIdChain() {
        return idChain;
    }

    public void setIdChain(Integer idChain) {
        this.idChain = idChain;
    }

    public Integer getIdZone() {
        return idZone;
    }

    public void setIdZone(Integer idZone) {
        this.idZone = idZone;
    }
}
