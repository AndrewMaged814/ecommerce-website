package com.example.demo.model;

import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.annotation.Inherited;
import java.time.LocalDate;

//import javax.persistence.Entity;


//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name ="customer")
public class Customer extends Person {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

//
//    public long getC_id() {
//        return c_id;
//    }
//
//    public void setC_id(long c_id) {
//        this.c_id = c_id;
//    }

//    public Customer(long P_id, String name, String email, char gender, LocalDate dateOfBirth, String email1, String phone, char buildingnumber, String streetname, String pin) {
//        super(P_id, name, email, gender);
//        this.dateOfBirth = dateOfBirth;
//        this.email = email1;
//        this.phone = phone;
//        this.buildingnumber = buildingnumber;
//        this.streetname = streetname;
//        this.pin = pin;
//    }

//    public Customer(LocalDate dateOfBirth, String email, String phone, char buildingnumber, String streetname, String pin) {
//        this.dateOfBirth = dateOfBirth;
//        this.email = email;
//        this.phone = phone;
//        this.buildingnumber = buildingnumber;
//        this.streetname = streetname;
//        this.pin = pin;
//    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//@Column(name = "c_id")
    private long c_id;

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


//    public String getFname() {
//        return fname;
//    }
//
//    public void setFname(String fname) {
//        this.fname = fname;
//    }
//
//    public String getLname() {
//        return lname;
//    }
//
//    public void setLname(String lname) {
//        this.lname = lname;
//    }
//
//    public char getGender() {
//        return gender;
//    }
//
//    public void setGender(char gender) {
//        this.gender = gender;
//    }
    public long getC_id() {
        return c_id;
    }

    public void setC_id(long c_id) {
        this.c_id = c_id;
    }

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

//    public long getC_id() {
//        return c_id;
//    }
//
//    public void setC_id(long c_id) {
//        this.c_id = c_id;
//    }
}
