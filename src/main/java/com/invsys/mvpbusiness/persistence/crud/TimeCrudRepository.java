package com.invsys.mvpbusiness.persistence.crud;

import com.invsys.mvpbusiness.persistence.entity.Time;
import org.springframework.data.repository.CrudRepository;

public interface TimeCrudRepository extends CrudRepository<Time, Integer> {
}
