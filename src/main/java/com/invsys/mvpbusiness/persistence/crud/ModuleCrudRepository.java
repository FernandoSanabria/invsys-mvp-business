package com.invsys.mvpbusiness.persistence.crud;

import com.invsys.mvpbusiness.persistence.entity.Module;
import org.springframework.data.repository.CrudRepository;

public interface ModuleCrudRepository extends CrudRepository<Module,Integer> {
}
