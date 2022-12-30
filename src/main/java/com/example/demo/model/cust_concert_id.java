package com.example.demo.model;

import java.io.Serializable;

public class cust_concert_id implements Serializable {
    private Integer C_ID;

    private  Integer CON_ID;

    // default constructor

    public cust_concert_id() {
    }

    public cust_concert_id(Integer c_ID, Integer CON_ID) {
        C_ID = c_ID;
        this.CON_ID = CON_ID;
    }
    // equals() and hashCode()

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
