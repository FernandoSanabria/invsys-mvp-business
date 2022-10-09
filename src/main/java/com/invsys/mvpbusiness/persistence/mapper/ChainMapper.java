package com.invsys.mvpbusiness.persistence.mapper;

import com.invsys.mvpbusiness.domain.DomainChain;
import com.invsys.mvpbusiness.persistence.entity.Chain;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChainMapper {
    DomainChain toDomainChain(Chain chain);
    List<DomainChain> toDomainChains(List<Chain> chains);

    @InheritInverseConfiguration
    @Mappings(
            @Mapping(target = "id", ignore = true)
    )
    Chain toChain(DomainChain domainChain);
}
