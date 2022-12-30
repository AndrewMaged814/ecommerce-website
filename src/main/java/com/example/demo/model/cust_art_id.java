package com.example.demo.model;

import java.io.Serializable;

public class cust_art_id implements Serializable {
    private Integer C_ID;

    private  Integer A_ID;

    // default constructor


    public cust_art_id() {
    }

    public cust_art_id(Integer c_ID, Integer a_ID) {
        C_ID = c_ID;
        A_ID = a_ID;
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
