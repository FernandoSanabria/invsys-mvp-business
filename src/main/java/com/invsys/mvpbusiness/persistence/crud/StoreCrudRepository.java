package com.invsys.mvpbusiness.persistence.crud;

import com.invsys.mvpbusiness.persistence.entity.Store;
import org.springframework.data.repository.CrudRepository;

public interface StoreCrudRepository extends CrudRepository<Store, Integer> {
}
