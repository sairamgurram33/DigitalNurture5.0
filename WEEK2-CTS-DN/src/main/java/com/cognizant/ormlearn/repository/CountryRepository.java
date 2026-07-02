package com.cognizant.ormlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // Search countries containing text
    List<Country> findByNameContaining(String text);

    // Search countries containing text in ascending order
    List<Country> findByNameContainingOrderByNameAsc(String text);

    // Search countries starting with a letter
    List<Country> findByNameStartingWith(String alphabet);
}