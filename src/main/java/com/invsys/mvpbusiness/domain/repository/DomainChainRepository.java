package com.invsys.mvpbusiness.domain.repository;

import com.invsys.mvpbusiness.domain.DomainChain;

import java.util.List;

public interface DomainChainRepository {
    List<DomainChain> getAllByCountry(String country);
    DomainChain save(DomainChain chain);
}
