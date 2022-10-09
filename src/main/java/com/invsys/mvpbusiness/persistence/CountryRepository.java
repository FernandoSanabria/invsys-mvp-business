package com.invsys.mvpbusiness.persistence;

import com.invsys.mvpbusiness.persistence.crud.CountryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CountryRepository {

    @Autowired
    CountryCrudRepository repository;


}
