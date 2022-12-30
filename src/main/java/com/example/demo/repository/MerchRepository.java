package com.example.demo.repository;

import com.example.demo.model.Merch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchRepository extends JpaRepository<Merch,Long> {
}
