package com.github.guilhermefsag.citiesapi.states.repositories;

import com.github.guilhermefsag.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
