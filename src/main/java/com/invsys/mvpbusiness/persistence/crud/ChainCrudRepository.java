package com.invsys.mvpbusiness.persistence.crud;

import com.invsys.mvpbusiness.persistence.entity.Chain;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChainCrudRepository extends CrudRepository<Chain, Integer> {
    List<Chain> findByCountry(String name);
}
