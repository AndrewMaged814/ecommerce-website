package com.example.demo.repository;

import com.example.demo.model.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcertRepository extends JpaRepository<Concert,Long> {
}
