package com.solr.springSolr.controller;

import com.solr.springSolr.document.Order;
import com.solr.springSolr.repository.SolrOrderRepository;
import com.solr.springSolr.service.OrderService;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    SolrOrderRepository solrOrderRepository;

    @Autowired
    OrderService service;

    @PostMapping("/order")
    public String createOrder(@RequestBody Order order){
        String desc = "Order Created";
        solrOrderRepository.save(order);
        return desc;
    }

    @GetMapping("/order/{orderid}")
    public Order readOrder(@PathVariable(value = "orderid") Long orderid){
        return solrOrderRepository.findById(orderid).get();
    }

    @DeleteMapping("/deleteOrder/{orderid}")
    public String deleteOrder(@PathVariable(value = "orderid") Long orderid) throws IOException, SolrServerException {
        String desc = "Order Deleted";
        service.deletingDocumentById(orderid);
        return desc;
    }
}
