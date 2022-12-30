package com.example.demo.controller;

import com.example.demo.model.Ticket;
import com.example.demo.service.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ticket")
public class TicketsController {

    private final TicketService ticketService;

    public TicketsController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/addticket")

    public ResponseEntity<Ticket> saveTicket(@RequestBody Ticket ticket) {


        return new ResponseEntity<Ticket>(ticketService.addTicket(ticket), HttpStatus.CREATED);
    }

    //Get all Ticket rest API
    @GetMapping("/getalltickets")
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();

    }

    //Get Ticket by ID rest API
    //https://localhost:8080/api/ticket/1
    @GetMapping("{id}")
    public ResponseEntity<Ticket> getTicketById(@PathVariable("id") long ticketId) {
        return new ResponseEntity<Ticket>(ticketService.getTicketsById(ticketId), HttpStatus.OK);
    }


    //Build update Ticket REST API
    @PutMapping("{id}")
    public ResponseEntity<Ticket> updateTicket(@PathVariable("id") long id, @RequestBody Ticket ticket) {
        return new ResponseEntity<Ticket>(ticketService.updateTickets(ticket, id), HttpStatus.OK);
    }

//Build delete Ticket REST API

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTicket(@PathVariable("id") long id) {
        //deletes customers from database
        ticketService.deleteTicket(id);
        return new ResponseEntity<String>("Ticket deleted successfully!.", HttpStatus.OK);
    }

//Build delete all Ticket REST API

    @DeleteMapping
    public ResponseEntity<String> deleteAllCustomers() {
        ticketService.deleteAllTickets();
        return new ResponseEntity<String>("All Tickets successfully deleted", HttpStatus.OK);
    }

}
