package com.invsys.mvpbusiness.domain.service;

import com.invsys.mvpbusiness.domain.DomainChain;
import com.invsys.mvpbusiness.domain.repository.DomainChainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomainChainService {

    @Autowired
    DomainChainRepository repository;

    public List<DomainChain> getAllByCountry(String country) {
     return repository.getAllByCountry(country);
    }

    public DomainChain save(DomainChain chain) {
        return repository.save(chain);
    }

}
