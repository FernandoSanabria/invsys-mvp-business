package com.invsys.mvpbusiness.persistence;

import com.invsys.mvpbusiness.domain.DomainChain;
import com.invsys.mvpbusiness.domain.repository.DomainChainRepository;
import com.invsys.mvpbusiness.persistence.crud.ChainCrudRepository;
import com.invsys.mvpbusiness.persistence.entity.Chain;
import com.invsys.mvpbusiness.persistence.mapper.ChainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChainRepository implements DomainChainRepository {

    @Autowired
    ChainCrudRepository chainCrudRepository;

    @Autowired
    private ChainMapper mapper;

    @Override
    public List<DomainChain> getAllByCountry(String country) {
        List<Chain> chains = chainCrudRepository.findByCountry(country);
        return mapper.toDomainChains(chains);
    }

    @Override
    public DomainChain save(DomainChain domainChain) {
        Chain chain = mapper.toChain(domainChain);
        return mapper.toDomainChain(chainCrudRepository.save(chain));
    }
}
