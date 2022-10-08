package com.invsys.mvpbusiness.persistence.crud;

import com.invsys.mvpbusiness.persistence.entity.UserStore;
import org.springframework.data.repository.CrudRepository;

public interface UserStoreCrudRepository extends CrudRepository<UserStore,Integer> {
}
