package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {


FlightFinder flightFinder = new FlightFinder();
            private Map<String, Boolean> flights(){
            Map<String, Boolean> flightSchedule = new HashMap<>();

            flightSchedule.put(WAW, true);
            flightSchedule.put(MAD, true);
            flightSchedule.put(LAX, false);
            flightSchedule.put(LDN, true);

            return flightSchedule;
        }
        boolean findFilght(Flight flight) throws RouteNotFoundException {



    //HashMap, której kluczem będzie String przechowujący nazwę lotniska, a wartością Boolean
    //informujący o tym czy można na dane lotnisko polecieć. Przykład: Map<String, Boolean>.
      //      c) logika powinna wyszukiwać loty w mapie.
    //Jeżeli dane lotnisko nie będzie istnieć w mapie, należy rzucić wyjątkiem RouteNotFoundException.
}
