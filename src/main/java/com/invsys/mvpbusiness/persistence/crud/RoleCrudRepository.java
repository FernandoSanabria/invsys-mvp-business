package com.invsys.mvpbusiness.persistence.crud;

import com.invsys.mvpbusiness.persistence.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleCrudRepository extends CrudRepository<Role, Integer> {
}
