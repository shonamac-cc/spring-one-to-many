package com.codeclan.cityservice.repositories;

import com.codeclan.cityservice.models.Continent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long> {
}
