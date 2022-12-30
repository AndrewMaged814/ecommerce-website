package com.example.demo.controller;

import com.example.demo.model.Merch;
import com.example.demo.model.Ticket;
import com.example.demo.service.MerchService;
import com.example.demo.service.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/merch")
public class MerchController {

    private final MerchService merchService;

    public MerchController(MerchService merchService) {
        this.merchService = merchService;
    }

    @PostMapping("/addmerch")

    public ResponseEntity<Merch> saveMerch(@RequestBody Merch merch) {


        return new ResponseEntity<Merch>(merchService.addMerch(merch), HttpStatus.CREATED);
    }

    //Get all Ticket rest API
    @GetMapping("/getallMerch")
    public List<Merch> getAllMerch() {
        return merchService.getAllMerch();

    }

    //Get Ticket by ID rest API
    //https://localhost:8080/api/merch/1
    @GetMapping("{id}")
    public ResponseEntity<Merch> getTicketById(@PathVariable("id") long merchId) {
        return new ResponseEntity<Merch>(merchService.getMerchById(merchId), HttpStatus.OK);
    }


    //Build update Merch REST API
    @PutMapping("{id}")
    public ResponseEntity<Merch> updateTicket(@PathVariable("id") long id, @RequestBody Merch merch) {
        return new ResponseEntity<Merch>(merchService.updateMerch(merch, id), HttpStatus.OK);
    }

//Build delete Merch REST API

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteMerch(@PathVariable("id") long id) {
        //deletes Merch from database
        merchService.deleteMerch(id);
        return new ResponseEntity<String>("Merch deleted successfully!.", HttpStatus.OK);
    }

//Build delete all Merch REST API

    @DeleteMapping
    public ResponseEntity<String> deleteAllMerch() {
        merchService.deleteAllMerch();
        return new ResponseEntity<String>("All Merch successfully deleted", HttpStatus.OK);
    }

}
