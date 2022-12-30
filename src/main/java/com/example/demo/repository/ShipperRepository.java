package com.example.demo.repository;

import com.example.demo.model.Shipper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipperRepository extends JpaRepository<Shipper,Long> {
}
