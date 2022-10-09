package com.invsys.mvpbusiness.persistence.mapper;

import com.invsys.mvpbusiness.domain.DomainCountry;
import com.invsys.mvpbusiness.persistence.entity.Country;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CountryMapper {
    DomainCountry toDomainCountry(Country country);
    Country toCountry(Country country);
}
