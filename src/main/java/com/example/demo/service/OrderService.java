package com.example.demo.service;

import com.example.demo.exception;
import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order addOrder(Order order){
        return orderRepository.save(order);
    }


    public Order getOrder(long id){
        return orderRepository.findById(id).get();
    }
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order getOrderById(long id)
    {
        Optional<Order> order = orderRepository.findById(id);
        if(order.isPresent()){
            return order.get();
        }
        else{
            throw new exception("Order","Id",id);
        }
    }

    public Order updateOrder(Order order,long id)
    {
        //checking if the Orders with give id exists in the database or not
        Order existingOrders = orderRepository.findById(id).orElseThrow(()->new exception("Orders","Id",id));
        existingOrders.setO_ID(order.getO_ID());
        existingOrders.setC_id(order.getC_id());
        existingOrders.setS_id(order.getS_id());
        existingOrders.setOrder_comment(order.getOrder_comment());
        existingOrders.setStatus(order.getStatus());

        orderRepository.save(existingOrders);
        return existingOrders;

    }

    public void deleteOrders(long id){

        //We have to check if the Orders exists in the database or not
        orderRepository.findById(id).orElseThrow(()->new exception("Order","Id",id));
        orderRepository.deleteById(id);
    }

    public void deleteAllOrders(){
        orderRepository.deleteAll();
    }


}