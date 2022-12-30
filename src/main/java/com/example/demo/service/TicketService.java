package com.example.demo.service;

import com.example.demo.exception;
import com.example.demo.model.Ticket;
import com.example.demo.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket addTicket(Ticket ticket){
        return ticketRepository.save(ticket);
    }


    public Ticket getTicket(long id){
        return ticketRepository.findById(id).get();
    }
    public List<Ticket> getAllTickets(){
        return ticketRepository.findAll();
    }

    public Ticket getTicketsById(long id)
    {
        Optional<Ticket> ticket = ticketRepository.findById(id);
        if(ticket.isPresent()){
            return ticket.get();
        }
        else{
            throw new exception("Ticket","Id",id);
        }
    }

    public Ticket updateTickets(Ticket ticket,long id)
    {
        //checking if the Ticket with give id exists in the database or not
        Ticket existingTicket = ticketRepository.findById(id).orElseThrow(()->new exception("Ticket","Id",id));
        existingTicket.setTicket_type(ticket.getTicket_type());
        existingTicket.setCond_id(ticket.getCond_id());
        existingTicket.setQuantity(ticket.getQuantity());
        ticketRepository.save(existingTicket);
        return existingTicket;

    }

    public void deleteTicket(long id){

        //We have to check if the ticket exists in the database or not
        ticketRepository.findById(id).orElseThrow(()->new exception("Ticket","Id",id));
        ticketRepository.deleteById(id);
    }

    public void deleteAllTickets(){
        ticketRepository.deleteAll();
    }


}