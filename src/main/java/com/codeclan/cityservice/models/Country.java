package com.codeclan.cityservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnoreProperties("countries")
    @ManyToOne
    @JoinColumn(name = "continent_id", nullable = false)
    private Continent continent;

    @JsonIgnoreProperties("country")
    @OneToMany(mappedBy = "country")
    private List<City> cities;

    public Country(String name, Continent continent) {
        this.name = name;
        this.continent = continent;
        this.cities = new ArrayList<>();
    }

    public Country() {
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

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public void addCity(City city){
        this.cities.add(city);
    }
}
