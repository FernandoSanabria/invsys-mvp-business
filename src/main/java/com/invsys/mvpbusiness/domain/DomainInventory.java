package com.invsys.mvpbusiness.domain;

import java.time.LocalDateTime;

public class DomainInventory {
    private int id;

    private int units;

    private DomainProduct product;

    private DomainStore store;

    private String batchNumber;

    private LocalDateTime expirationDate;

    private DomainUser createdBy;

    private DomainUser updatedBy;

    private DomainTime time;


}
