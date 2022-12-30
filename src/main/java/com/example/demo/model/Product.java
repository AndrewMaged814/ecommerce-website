package com.example.demo.model;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "product")
@Inheritance(strategy = InheritanceType.JOINED)
//@MappedSuperclass
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long prod_id;
    @Column(name = "a_id")
    private Integer a_id;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name="prod_type")
    private String prod_type;
    @Column(name="price")
    private Integer price;

    public long getProd_id() {
        return prod_id;
    }

    public void setProd_id(long prod_id) {
        this.prod_id = prod_id;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProd_type() {
        return prod_type;
    }

    public void setProd_type(String prod_type) {
        this.prod_type = prod_type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}