package com.example.demo.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "artist")
public class Artist extends Person {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "a_id")
    private long a_id;


    @Column(name = "description")
    private String description;

    public long getA_id() {
        return a_id;
    }

    public void setA_id(long a_id) {
        this.a_id = a_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
