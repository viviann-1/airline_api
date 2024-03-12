package com.example.airline_api.components;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.FlightRepository;
import com.example.airline_api.repositories.PassengerRepository;
import com.example.airline_api.services.FlightService;
import com.example.airline_api.services.PassengerService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;



@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FlightService flightService;
    @Autowired
    PassengerService passengerService;
    @Autowired
    FlightRepository flightRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //Flights
        Flight arubaFlight = new Flight("Aruba", 300, "01/07/2024", "12:00 pm");
        flightRepository.save(arubaFlight);

        Flight icelandFlight = new Flight("Iceland", 100, "03/12/2025", "1:00 am");
        flightRepository.save(icelandFlight);

        Flight brazilFlight = new Flight("Brazil", 200, "07/11/2024", "15:30 pm");
        flightRepository.save(brazilFlight);

        Flight greenlandFlight = new Flight("Greenland", 400, "10/02/2025", "10:15 pm");
        flightRepository.save(greenlandFlight);


        //Passengers
        Passenger passenger1 = new Passenger("Bob Smith", "bobsmith@email.com");
        flightService.addNewPassenger(passenger1);

        Passenger passenger2 = new Passenger("Sally Smith", "sallysmith@email.com");
        flightService.addNewPassenger(passenger2);

        Passenger passenger3 = new Passenger("John Jones", "johnjones@email.com");
        flightService.addNewPassenger(passenger3);

        Passenger passenger4 = new Passenger("Jane Jones", "janejones@email.com");
        flightService.addNewPassenger(passenger4);


    }

}
