package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(cust_concert_id.class)
public class cust_concert {
    @Id
    private Integer C_ID;

    @Id
    private String CON_ID;

    // getters and setters


    public Integer getC_ID() {
        return C_ID;
    }

    public void setC_ID(Integer c_ID) {
        C_ID = c_ID;
    }

    public String getCON_ID() {
        return CON_ID;
    }

    public void setCON_ID(String CON_ID) {
        this.CON_ID = CON_ID;
    }
}
