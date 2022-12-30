package com.example.demo.controller;

import com.example.demo.model.Artist;
import com.example.demo.model.Customer;
import com.example.demo.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/artist")
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/getallartists")
    public List<Artist> getAllArtists() {
        return artistService.getAllArtists();

    }

    @GetMapping("{id}")
    public ResponseEntity<Artist> getArtistById(@PathVariable("id") long artistId) {
        return new ResponseEntity<Artist>(artistService.getArtistById(artistId), HttpStatus.OK);
    }
}
