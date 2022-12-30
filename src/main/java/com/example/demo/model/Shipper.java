package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "shipper")
public class Shipper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long s_id;


    @Column(name = "company")
    private String company;


    public long getS_id() {
        return s_id;
    }

    public void setS_id(long s_id) {
        this.s_id = s_id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
