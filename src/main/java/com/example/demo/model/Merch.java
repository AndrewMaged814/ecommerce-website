package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name ="merch")
public class Merch extends Product {

    @Column(name="merch_name")
    private String merch_name;

    @Column(name="description")
    private String description;

    public String getMerch_name() {
        return merch_name;
    }

    public void setMerch_name(String merch_name) {
        this.merch_name = merch_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
