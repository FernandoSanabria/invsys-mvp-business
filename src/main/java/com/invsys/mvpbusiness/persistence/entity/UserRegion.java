package com.invsys.mvpbusiness.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_region", schema = "public")
public class UserRegion {
    @EmbeddedId
    private UserRegionPK id;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_region", insertable = false, updatable = false)
    private Region region;

    public UserRegionPK getId() {
        return id;
    }

    public void setId(UserRegionPK id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
