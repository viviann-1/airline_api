package com.example.airline_api.repositories;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    default Flight addFlightDetails(){
        return null;
    };

}
