package com.invsys.mvpbusiness.persistence.crud;

import com.invsys.mvpbusiness.persistence.entity.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryCrudRepository extends CrudRepository<Country, Integer> {
}
