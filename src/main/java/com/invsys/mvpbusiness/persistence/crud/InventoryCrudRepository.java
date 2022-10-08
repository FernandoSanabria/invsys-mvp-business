package com.invsys.mvpbusiness.persistence.crud;

import com.invsys.mvpbusiness.persistence.entity.Inventory;
import org.springframework.data.repository.CrudRepository;

public interface InventoryCrudRepository extends CrudRepository<Inventory, Integer> {
}
