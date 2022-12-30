package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/addproduct")

    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {


        return new ResponseEntity<Product>(productService.addProduct(product), HttpStatus.CREATED);
    }

    //Get all products rest API
    @GetMapping("/getallproducts")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();

    }

    //Get product by ID rest API
    //https://localhost:8080/api/product/1
    @GetMapping("{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") long productID) {
        return new ResponseEntity<Product>(productService.getProductById(productID), HttpStatus.OK);
    }


    //Build update product REST API
    @PutMapping("{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") long id, @RequestBody Product product) {
        return new ResponseEntity<Product>(productService.updateProduct(product, id), HttpStatus.OK);
    }

//Build delete product REST API

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") long id) {
        //deletes product from database
        productService.deleteProducts(id);
        return new ResponseEntity<String>("product deleted successfully!.", HttpStatus.OK);
    }

//Build delete all product REST API

    @DeleteMapping
    public ResponseEntity<String> deleteAllProducts() {
        productService.deleteAllProducts();
        return new ResponseEntity<String>("All products successfully deleted", HttpStatus.OK);
    }

}
