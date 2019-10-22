package com.codeclan.cityservice.components;

import com.codeclan.cityservice.models.City;
import com.codeclan.cityservice.models.Continent;
import com.codeclan.cityservice.models.Country;
import com.codeclan.cityservice.repositories.CityRepository;
import com.codeclan.cityservice.repositories.ContinentRepository;
import com.codeclan.cityservice.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CityRepository cityRepository;

    @Autowired
    CountryRepository countryRepository;

    @Autowired
    ContinentRepository continentRepository;

    public void run(ApplicationArguments args){

        Continent europe = new Continent("Europe");
        continentRepository.save(europe);

        Continent africa = new Continent("Africa");
        continentRepository.save(africa);

        Continent asia = new Continent("Asia");
        continentRepository.save(asia);

        Continent northAmerica = new Continent("North America");
        continentRepository.save(northAmerica);

        Continent australasia = new Continent("Australasia");
        continentRepository.save(australasia);

        Country france = new Country("France", europe);
        countryRepository.save(france);

        Country uk = new Country("United Kingdom", europe);
        countryRepository.save(uk);

        Country southAfrica = new Country("South Africa", africa);
        countryRepository.save(southAfrica);

        Country canada = new Country("Canada", northAmerica);
        countryRepository.save(canada);

        Country australia = new Country("Australia", australasia);
        countryRepository.save(australia);

        Country japan = new Country("Japan", asia);
        countryRepository.save(japan);

        City paris = new City("Paris", 12000, france, europe);
        cityRepository.save(paris);

        City edinburgh = new City("Edinburgh", 15000, uk, europe);
        cityRepository.save(edinburgh);

        City capeTown = new City("Cape Town", 50000, southAfrica, africa);
        cityRepository.save(capeTown);

        City vancouver = new City("Vancouver", 75000, canada, northAmerica);
        cityRepository.save(vancouver);

        City sydney = new City("Sydney", 43000, australia, australasia);
        cityRepository.save(sydney);

        City tokyo = new City("Tokyo", 123000, japan, asia);
        cityRepository.save(tokyo);
    }
}
