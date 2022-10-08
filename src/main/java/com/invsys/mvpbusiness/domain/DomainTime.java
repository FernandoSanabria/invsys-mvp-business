package com.invsys.mvpbusiness.domain;

import java.time.LocalDateTime;

public class DomainTime {
    private int id;

    private LocalDateTime updatingDate;

    private LocalDateTime creationDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
