package com.example.airline_api.components;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.FlightRepository;
import com.example.airline_api.repositories.PassengerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;



@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FlightRepository flightRepository;
    @Autowired
    PassengerRepository passengerRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //Flights & Passengers
        Flight arubaFlight = new Flight("Aruba", 300, "01/07/2024", "12:00 pm");
        flightRepository.save(arubaFlight);

        Passenger passenger1 = new Passenger("Bob Smith", "bobsmith@email.com");

        Flight icelandFlight = new Flight("Iceland", 100, "03/12/2025", "1:00 am");
        flightRepository.save(icelandFlight);

        Passenger passenger2 = new Passenger("Sally Smith", "sallysmith@email.com");

        Flight brazilFlight = new Flight("Brazil", 200, "07/11/2024", "15:30 pm");
        flightRepository.save(brazilFlight);

        Passenger passenger3 = new Passenger("John Jones", "johnjones@email.com");

        Flight greenlandFlight = new Flight("Greenland", 400, "10/02/2025", "10:15 pm");
        flightRepository.save(greenlandFlight);

        Passenger passenger4 = new Passenger("Jane Jones", "janejones@email.com");

    }

}
