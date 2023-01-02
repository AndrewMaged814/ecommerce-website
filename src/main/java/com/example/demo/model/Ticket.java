package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name ="ticket")
public class Ticket extends Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long t_id;
    @Column(name = "con_id")
    private Integer cond_id;

    @Column(name="ticket_type")
    private String ticket_type;

    public long getT_id() {
        return t_id;
    }

    public void setT_id(long t_id) {
        this.t_id = t_id;
    }

    public Integer getCond_id() {
        return cond_id;
    }

    public void setCond_id(Integer cond_id) {
        this.cond_id = cond_id;
    }

    public String getTicket_type() {
        return ticket_type;
    }

    public void setTicket_type(String ticket_type) {
        this.ticket_type = ticket_type;
    }
}
