package com.example.demo.service;


import com.example.demo.exception;
import com.example.demo.model.Concert;
import com.example.demo.model.Shipper;
import com.example.demo.repository.ConcertRepository;
import com.example.demo.repository.ShipperRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipperService {
    private final ShipperRepository shipperRepository;

    public ShipperService(ShipperRepository shipperRepository) {
        this.shipperRepository = shipperRepository;
    }

    public List<Shipper> getAllShippers(){
        return shipperRepository.findAll();
    }

    public Shipper getShipperById(long id)
    {
        Optional<Shipper> shipper = shipperRepository.findById(id);
        if(shipper.isPresent()){
            return shipper.get();
        }
        else{
            throw new exception("Shipper","Id",id);
        }

    }

}