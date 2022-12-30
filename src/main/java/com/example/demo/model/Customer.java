package com.example.demo.model;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name ="customer")
public class Customer extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long c_id;

    public long getC_id() {
        return c_id;
    }

    public void setC_id(long c_id) {
        this.c_id = c_id;
    }
    @Column(name = "email")
    private String email;

    @Column(name="phone", unique = true)
    private String phone;

    @Column(name="b_no")
    private char buildingnumber;

    @Column(name="street_name")
    private String streetname;

    @Column(name="pin")
    private String pin;
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public char getBuildingnumber() {
        return buildingnumber;
    }

    public void setBuildingnumber(char buildingnumber) {
        this.buildingnumber = buildingnumber;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

}
