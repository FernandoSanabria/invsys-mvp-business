package com.invsys.mvpbusiness.persistence.entity;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "time", schema = "public")
public class Time {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "updating_date")
    private LocalDateTime updatingDate;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getUpdatingDate() {
        return updatingDate;
    }

    public void setUpdatingDate(LocalDateTime updatingDate) {
        this.updatingDate = updatingDate;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
