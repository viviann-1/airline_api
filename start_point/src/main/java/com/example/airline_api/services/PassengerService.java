package com.example.airline_api.services;

import com.example.airline_api.models.Passenger;
import com.example.airline_api.models.PassengerDTO;
import com.example.airline_api.repositories.PassengerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
@Transactional
public class PassengerService {
    @Autowired
    PassengerRepository passengerRepository;

    // adding a new passenger
    public Passenger addNewPassenger(PassengerDTO passengerDTO, Long id){
        Passenger passengerToAdd = passengerRepository.addPassengerDetails();
        passengerRepository.save(passengerToAdd);
        return passengerToAdd;
    }
    //display details of all passengers
    public List<Passenger> findAllPassengers(){
        return passengerRepository.findAll();
    }
    //display details of specific passenger
    public Optional<Passenger> findPassenger(Long id){
        return passengerRepository.findById(id);
    }

}
