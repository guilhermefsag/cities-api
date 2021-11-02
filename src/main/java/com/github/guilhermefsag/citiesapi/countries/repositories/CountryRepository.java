package com.github.guilhermefsag.citiesapi.countries.repositories;

import com.github.guilhermefsag.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
