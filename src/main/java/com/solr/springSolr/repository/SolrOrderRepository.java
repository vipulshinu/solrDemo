package com.solr.springSolr.repository;


import com.solr.springSolr.document.Order;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolrOrderRepository extends SolrCrudRepository<Order, Long> {

//    Order findByOrderid(Long orderid);

}

