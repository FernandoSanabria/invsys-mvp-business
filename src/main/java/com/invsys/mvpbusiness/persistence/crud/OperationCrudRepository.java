package com.invsys.mvpbusiness.persistence.crud;

import com.invsys.mvpbusiness.persistence.entity.Operation;
import org.springframework.data.repository.CrudRepository;

public interface OperationCrudRepository extends CrudRepository<Operation,Integer> {
}
