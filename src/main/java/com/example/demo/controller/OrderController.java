package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.model.Product;
import com.example.demo.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/addorder")

    public ResponseEntity<Order> saveOrder(@RequestBody Order order) {


        return new ResponseEntity<Order>(orderService.addOrder(order), HttpStatus.CREATED);
    }

    //Get all orders rest API
    @GetMapping("/getallorders")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();

    }

    //Get order by ID rest API
    //https://localhost:8080/api/order/1
    @GetMapping("{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable("id") long ordersID) {
        return new ResponseEntity<Order>(orderService.getOrderById(ordersID), HttpStatus.OK);
    }


    //Build update orders REST API
    @PutMapping("{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable("id") long id, @RequestBody Order order) {
        return new ResponseEntity<Order>(orderService.updateOrder(order, id), HttpStatus.OK);
    }

//Build delete orders REST API

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable("id") long id) {
        //deletes product from database
        orderService.deleteOrders(id);
        return new ResponseEntity<String>("order deleted successfully!.", HttpStatus.OK);
    }

//Build delete all orders REST API

    @DeleteMapping
    public ResponseEntity<String> deleteAllProducts() {
        orderService.deleteAllOrders();
        return new ResponseEntity<String>("All orders successfully deleted", HttpStatus.OK);
    }

}
