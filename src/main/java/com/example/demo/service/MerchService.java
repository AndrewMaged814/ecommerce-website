package com.example.demo.service;

import com.example.demo.exception;
import com.example.demo.model.Merch;
import com.example.demo.repository.MerchRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MerchService {

    private final MerchRepository merchRepository;

    public MerchService(MerchRepository merchRepository) {
        this.merchRepository = merchRepository;
    }

    public Merch addMerch(Merch merch){
        return merchRepository.save(merch);
    }


    public Merch getMerch(long id){
        return merchRepository.findById(id).get();
    }
    public List<Merch> getAllMerch(){
        return merchRepository.findAll();
    }

    public Merch getMerchById(long id)
    {
        Optional<Merch> merch = merchRepository.findById(id);
        if(merch.isPresent()){
            return merch.get();
        }
        else{
            throw new exception("Merch","Id",id);
        }
    }

    public Merch updateMerch(Merch merch,long id)
    {
        //checking if the Merch with give id exists in the database or not
        Merch existingMerch = merchRepository.findById(id).orElseThrow(()->new exception("Merch","Id",id));
        existingMerch.setProd_id(merch.getProd_id());
        existingMerch.setA_id((merch.getA_id()));
        existingMerch.setQuantity(merch.getQuantity());
        existingMerch.setPrice(merch.getPrice());
        existingMerch.setMerch_name(merch.getMerch_name());
        existingMerch.setDescription(merch.getDescription());
        merchRepository.save(existingMerch);
        return existingMerch;

    }

    public void deleteMerch(long id){

        //We have to check if the Merch exists in the database or not
        merchRepository.findById(id).orElseThrow(()->new exception("Merch","Id",id));
        merchRepository.deleteById(id);
    }

    public void deleteAllMerch(){
        merchRepository.deleteAll();
    }


}