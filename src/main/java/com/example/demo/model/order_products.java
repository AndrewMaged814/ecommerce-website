package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(order_products_id.class)
public class order_products {
    @Id
    private Integer O_ID;
    @Id
    private String Prod_ID;
    private  Integer quantity;
    private  Integer price;

    // getters and setters
    public Integer getO_ID() {
        return O_ID;
    }

    public void setO_ID(Integer o_ID) {
        O_ID = o_ID;
    }

    public String getProd_ID() {
        return Prod_ID;
    }

    public void setProd_ID(String prod_ID) {
        Prod_ID = prod_ID;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
