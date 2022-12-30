package com.example.demo.repository;

import com.example.demo.model.Artist;
import com.example.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist,Long> {
}
