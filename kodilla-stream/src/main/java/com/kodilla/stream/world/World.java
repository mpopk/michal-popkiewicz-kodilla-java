package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class World{

    private List<Continent> continentList = new ArrayList<>();

    public List<Continent> getContinentList(){
        return continentList;

        }

public void continentList.addContinent{
        continentList.add(continent);
    }

public BigDecimal getPeopleQuantity(){
        return continentList.stream()
                .flatMap(continent -> continent.getPeopleQuantity().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

}

}
