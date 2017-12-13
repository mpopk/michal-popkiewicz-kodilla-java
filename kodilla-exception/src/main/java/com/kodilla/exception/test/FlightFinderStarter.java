package com.kodilla.exception.test;

public class FlightFinderStarter {
    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        try {
            boolean ticketsOk = flightFinder.findFlight(new Flight("WAW", "BCN"));

            System.out.println(ticketsOk);

        } catch (RouteNotFoundException e) {
            System.out.println("Requested route not available");

        }
    }
}