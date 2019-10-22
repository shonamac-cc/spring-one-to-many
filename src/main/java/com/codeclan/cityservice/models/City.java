package com.codeclan.cityservice.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
public class City {

    private Long id;
    private String name;
    private int size;
    private Country country;
    private Continent continent;

    public City(String name, int size, Country country, Continent continent) {
        this.name = name;
        this.size = size;
        this.country = country;
        this.continent = continent;
    }

    public City(){

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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
