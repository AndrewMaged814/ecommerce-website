package com.example.demo.model;

import javax.persistence.*;
@Entity
@Table(name = "concert")
public class Concert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long con_id;


    @Column(name = "a_id")
    private int a_id;

    @Column(name="capacity")
    private int capacity;

    @Column(name="region")
    private String region;

    @Column(name="country")
    private String country;

    @Column(name="street")
    private String street;

    @Column(name="venue")
    private String venue;

    public long getCon_id() {
        return con_id;
    }

    public void setCon_id(long con_id) {
        this.con_id = con_id;
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
}
