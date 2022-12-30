package com.example.demo.service;

import com.example.demo.exception;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }


    public Product getProduct(long id){
        return productRepository.findById(id).get();
    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(long id)
    {
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()){
            return product.get();
        }
        else{
            throw new exception("Product","Id",id);
        }
    }

    public Product updateProduct(Product product,long id)
    {
        //checking if the products with give id exists in the database or not
        Product existingProducts = productRepository.findById(id).orElseThrow(()->new exception("Products","Id",id));
        existingProducts.setA_id(product.getA_id());
        existingProducts.setProd_id(product.getProd_id());
        existingProducts.setPrice(product.getPrice());
        existingProducts.setQuantity(product.getQuantity());
        productRepository.save(existingProducts);
        return existingProducts;

    }

    public void deleteProducts(long id){

        //We have to check if the products exists in the database or not
        productRepository.findById(id).orElseThrow(()->new exception("Products","Id",id));
        productRepository.deleteById(id);
    }

    public void deleteAllProducts(){
        productRepository.deleteAll();
    }







}