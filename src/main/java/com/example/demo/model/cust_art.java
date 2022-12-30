package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(cust_art_id.class)
public class cust_art {
    @Id
    private Integer C_ID;

    @Id
    private String A_ID;

    // getters and setters

    public Integer getC_ID() {
        return C_ID;
    }

    public void setC_ID(Integer c_ID) {
        C_ID = c_ID;
    }

    public String getA_ID() {
        return A_ID;
    }

    public void setA_ID(String a_ID) {
        A_ID = a_ID;
    }
}
