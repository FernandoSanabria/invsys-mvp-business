package com.invsys.mvpbusiness.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserStorePK implements Serializable {
    @Column(name = "id_user")
    private Integer idUser;

    @Column(name = "id_store")
    private Integer idStore;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdStore() {
        return idStore;
    }

    public void setIdStore(Integer idStore) {
        this.idStore = idStore;
    }
}
