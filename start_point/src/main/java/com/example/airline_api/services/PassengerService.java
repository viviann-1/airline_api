package com.example.airline_api.services;

import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PassengerService {
    @Autowired
    PassengerRepository passengerRepository;

    // adding a new passenger
    public Passenger addNewPassenger(Passenger passenger){
        passengerRepository.save(passenger);
        return passenger;
    }
    public Passenger getPassengerById(Long id) {
        return passengerRepository.findById(id).get();
    }
    //display details of all passengers
    public List<Passenger> getAllPassengers(){
        return passengerRepository.findAll();
    }
}
