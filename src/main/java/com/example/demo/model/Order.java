package com.example.demo.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name ="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long O_ID;

    @Column(name = "C_id")
    private Integer C_id;
    @Column(name = "S_id")
    private Integer S_id;
    @Column(name = "status")
    private String status;
    @Column(name = "order_comment")
    private String order_comment;
    @Column(name="shipped_date")
    private LocalDate shipped_date;

    public long getO_ID() {
        return O_ID;
    }

    public void setO_ID(long o_ID) {
        O_ID = o_ID;
    }

    public Integer getC_id() {
        return C_id;
    }

    public void setC_id(Integer c_id) {
        C_id = c_id;
    }

    public Integer getS_id() {
        return S_id;
    }

    public void setS_id(Integer s_id) {
        S_id = s_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrder_comment() {
        return order_comment;
    }

    public void setOrder_comment(String order_comment) {
        this.order_comment = order_comment;
    }

    public LocalDate getShipped_date() {
        return shipped_date;
    }

    public void setShipped_date(LocalDate shipped_date) {
        this.shipped_date = shipped_date;
    }
}


