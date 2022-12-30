package com.example.demo.service;

import com.example.demo.exception;
import com.example.demo.model.Artist;
import com.example.demo.model.Customer;
import com.example.demo.repository.ArtistRepository;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public List<Artist> getAllArtists(){
        return artistRepository.findAll();
    }

    public Artist getArtistById(long id)
    {
        Optional<Artist> artist = artistRepository.findById(id);
        if(artist.isPresent()){
            return artist.get();
        }
        else{
            throw new exception("Artist","Id",id);
        }

        //or we can use lambda expression
        //return companyRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Company","Id",id));

    }
}
