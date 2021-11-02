package com.github.guilhermefsag.citiesapi.countries.resources;

import com.github.guilhermefsag.citiesapi.countries.entities.Country;
import com.github.guilhermefsag.citiesapi.countries.repositories.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/countries")

public class CountryRsc {

    private CountryRepository repository;

    public CountryRsc(CountryRepository repository) {
        this.repository = repository;
    }


    @GetMapping
    public Page<Country> countries(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> getOne(@PathVariable Long id) {
        Optional<Country> optional = repository.findById(id);

        if (optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else{
            return ResponseEntity.notFound().build();
        }

    }
}

