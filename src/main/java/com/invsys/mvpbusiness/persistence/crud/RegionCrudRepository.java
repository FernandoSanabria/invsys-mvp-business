package com.invsys.mvpbusiness.persistence.crud;

import com.invsys.mvpbusiness.persistence.entity.Region;
import org.springframework.data.repository.CrudRepository;

public interface RegionCrudRepository extends CrudRepository<Region, Integer> {
}
