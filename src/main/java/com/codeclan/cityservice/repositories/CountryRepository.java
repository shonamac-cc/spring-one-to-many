package com.codeclan.cityservice.repositories;

import com.codeclan.cityservice.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface CountryRepository extends JpaRepository<Country, Long> {
}
