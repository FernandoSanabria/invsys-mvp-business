package com.invsys.mvpbusiness.persistence.crud;

import com.invsys.mvpbusiness.persistence.entity.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyCrudRepository extends CrudRepository<Company,Integer> {
}
