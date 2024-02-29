package com.example.airline_api.services;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.FlightDTO;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.FlightRepository;
import com.example.airline_api.repositories.PassengerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
@Transactional
public class FlightService{
    @Autowired
    FlightRepository flightRepository;
    @Autowired
    PassengerRepository passengerRepository;

    //adding a new flight
    public Flight addNewFlight(FlightDTO flightDTO, Long id){
        Flight flightToAdd = flightRepository.addFlightDetails();
        flightRepository.save(flightToAdd);
        return flightToAdd;
    }
    // find all flights
    public List<Flight> findAllAvailableFlights(){
        return flightRepository.findAll();
    }
    // find specific flight
    public Optional<Flight> findFlight(Long id){
        return flightRepository.findById(id);
    }
    //booking a passenger onto a flight
    public Flight bookFlight(FlightDTO flightDTO, Long id){
        Flight flightBooking = flightRepository.findById(id).get();
        flightBooking.setDestination(flightDTO.getDestinationId());
        flightBooking.setCapacity(flightDTO.getCapacity());
        flightBooking.setDepartureDate(flightDTO.getDepartureDate());
        flightBooking.setDepartureTime(flightDTO.getDepartureTime());
        //flightBooking.setPassengers(flightDTO.getPassengerId());
        flightRepository.save(flightBooking);
        return flightBooking;
    }
    //cancel a flight
    public void cancelFlight(Long flightId){
        Flight flight = findFlight(flightId).get();
        for(Passenger passenger: flight.getPassengers()){
            passengerRepository.deleteById(passenger.getId());
        }
        flightRepository.deleteById(flightId);
    }

}
