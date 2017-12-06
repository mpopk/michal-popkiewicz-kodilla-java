package com.kodilla.stream.world;

import java.math.BigDecimal;


class Country {
    private static BigDecimal peopleQuantity;
    private String country;

    public Country(String country, BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
        this.country = country;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public String getCountry(){
        return country;
    }
}