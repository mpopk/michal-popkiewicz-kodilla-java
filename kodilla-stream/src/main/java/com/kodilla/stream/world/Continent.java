package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {

    private String name;
    private BigDecimal totalPopulation;
    private List<Country> countryList = new ArrayList<>();

    public List<Country> getCountryList() {
        return countryList;
    }

    public Continent(final String name, final BigDecimal totalPopulation) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getTotalPopulation() {
        return totalPopulation;
    }
}
