package com.invsys.mvpbusiness.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_store", schema = "public")
public class UserStore {
    @EmbeddedId
    private UserStorePK id;

    @ManyToOne
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "id_store", insertable = false, updatable = false)
    private Store store;

    public UserStorePK getId() {
        return id;
    }

    public void setId(UserStorePK id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
