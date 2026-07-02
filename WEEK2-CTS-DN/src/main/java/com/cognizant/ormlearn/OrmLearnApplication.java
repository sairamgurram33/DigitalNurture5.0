package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) throws CountryNotFoundException {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        LOGGER.info("Inside main");

        countryService = context.getBean(CountryService.class);

        // Hands-on 1
        testGetAllCountries();

        // Hands-on 6
        testFindCountry();
        testAddCountry();
        testSearchCountries();

        testSearchCountriesSorted();

        testCountriesStartingWith();
    }

    private static void testGetAllCountries() {

        LOGGER.info("Start");

        List<Country> countries = countryService.getAllCountries();

        LOGGER.debug("Countries={}", countries);

        LOGGER.info("End");
    }

    private static void testFindCountry() throws CountryNotFoundException {

        LOGGER.info("Start");

        Country country = countryService.findCountryByCode("IN");

        LOGGER.debug("Country={}", country);

        LOGGER.info("End");
    }
    private static void testAddCountry() throws CountryNotFoundException {

        LOGGER.info("Start");

        Country country = new Country("JA", "JayasreeLand");

        countryService.addCountry(country);

        Country addedCountry = countryService.findCountryByCode("JA");

        LOGGER.debug("Added Country={}", addedCountry);

        LOGGER.info("End");
    }
    private static void testSearchCountries() {

        LOGGER.info("Start");

        List<Country> countries =
                countryService.searchCountries("ou");

        LOGGER.debug("Countries={}", countries);

        LOGGER.info("End");
    }
    private static void testSearchCountriesSorted() {

        LOGGER.info("Start");

        List<Country> countries =
                countryService.searchCountriesSorted("ou");

        LOGGER.debug("Countries={}", countries);

        LOGGER.info("End");
    }
    private static void testCountriesStartingWith() {

        LOGGER.info("Start");

        List<Country> countries =
                countryService.getCountriesStartingWith("Z");

        LOGGER.debug("Countries={}", countries);

        LOGGER.info("End");
    }
}