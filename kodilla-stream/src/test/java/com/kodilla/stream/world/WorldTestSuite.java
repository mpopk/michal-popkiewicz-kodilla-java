package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test

    public void testGetPeopleQuantity() {
//Given
        World world = new World();

        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country spain = new Country("Spain", new BigDecimal("47000000"));
        Country italy = new Country("Italy", new BigDecimal("61000000"));

        Continent europe = new Continent();

        europe.addCountry(poland);
        europe.addCountry(spain);
        europe.addCountry(italy);

        world.addContinent(europe);


        Country egypt = new Country("Egypt", new BigDecimal("96000000"));
        Country kenya = new Country("Kenya", new BigDecimal("44000000"));
        Country nigeria = new Country("Nigeria", new BigDecimal("186000000"));

        Continent africa = new Continent();

        africa.addCountry(egypt);
        africa.addCountry(kenya);
        africa.addCountry(nigeria);

        world.addContinent(africa);

        Country india = new Country("India", new BigDecimal("1300000000"));
        Country china = new Country("China", new BigDecimal("1400000000"));
        Country pakistan = new Country("Pakistan", new BigDecimal("194000000"));

        Continent asia = new Continent();

        asia.addCountry(india);
        asia.addCountry(china);
        asia.addCountry(pakistan);

        world.addContinent(asia);
//when
        BigDecimal totalPopulation = world.getPeopleQuantity();

//then
        BigDecimal totalPopulationResult = new BigDecimal("3336000000");

        Assert.assertEquals(totalPopulationResult, totalPopulation);

    }
}