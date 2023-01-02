package com.example.demo.model;

import java.io.Serializable;

public class order_products_id implements Serializable {

    private Integer O_ID;

    private  Integer Prod_ID;


    // default constructor

    public order_products_id() {
    }

    public order_products_id(Integer o_ID, Integer prod_ID) {
        O_ID = o_ID;
        Prod_ID = prod_ID;
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
