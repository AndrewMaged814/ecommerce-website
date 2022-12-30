package com.example.demo.model;
import javax.persistence.*;
import java.time.LocalDate;

@Inheritance(strategy = InheritanceType.JOINED)
@MappedSuperclass

@Table(name = "person")
public class Person{
    @Column(name = "p_id")
    private long p_id;
    @Column(name="p_type")
    private  String p_type;
    @Column(name = "fname")
    private String fname;
    @Column(name = "lname")
    private String lname;
    @Column(name="dob")
    private LocalDate dateOfBirth;
    @Column(name="gender")
    private char gender;

    public String getP_type() {
        return p_type;
    }

    public void setP_type(String p_type) {
        this.p_type = p_type;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getP_id() {
        return p_id;
    }

    public void setP_id(long p_id) {
        this.p_id = p_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}