package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;


public class FlightFinder {

        FlightFinder flightFinder = new FlightFinder();

        private Map<String, Boolean> initFlightSchedule ( ) {
            Map<String, Boolean> flightSchedule = new HashMap<>();

            flightSchedule.put("WAW", true);
            flightSchedule.put("MAD", true);
            flightSchedule.put("LAX", false);
            flightSchedule.put("LDN", true);

            return flightSchedule;
        }


    boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightSchedule = initFlightSchedule();

        if (!flightSchedule.keySet().contains(flight.getArrivalAirport()) || !flightSchedule.keySet().contains(flight.getDepartureAirport())) {

            throw new RouteNotFoundException("Not available");
        } else if (flightSchedule.keySet().contains(flight.getArrivalAirport()) && flightSchedule.keySet().contains(flight.getDepartureAirport())) {
            System.out.println("Enjoy your flight");
        }
        return true;
    }

}



