package com.codeclan.cityservice.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "continents")
public class Continent {

    private Long id;
    private String name;
    private List<City> cities;
    private List<Country> countries;

    public Continent(String name) {
        this.name = name;
        this.cities = new ArrayList<>();
        this.countries = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<Country> countries) {
        this.countries = countries;
    }

    public void addCity(City city){
        this.cities.add(city);
    }

    public void addCountry(Country country){
        this.countries.add(country);
    }
}
