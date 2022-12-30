package com.example.demo.controller;
import com.example.demo.model.Shipper;
import com.example.demo.service.ShipperService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/shipper")
public class ShipperController {
    private final ShipperService shipperService;

    public ShipperController(ShipperService shipperService) {
        this.shipperService = shipperService;
    }


    //Get all shippers rest API
    @GetMapping("/getallshippers")
    public List<Shipper> getAllShippers() {
        return shipperService.getAllShippers();

    }

    //Get shippers by ID rest API
    //https://localhost:8080/api/companies/1
    @GetMapping("{id}")
    public ResponseEntity<Shipper> getShipperById(@PathVariable("id") long shipperid) {
        return new ResponseEntity<Shipper>(shipperService.getShipperById(shipperid), HttpStatus.OK);
    }

}
