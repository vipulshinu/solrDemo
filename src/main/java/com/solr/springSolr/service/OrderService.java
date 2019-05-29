package com.solr.springSolr.service;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class OrderService {



    public void deletingDocumentById(Long id) throws IOException, SolrServerException {
        SolrClient solrClient = new HttpSolrClient.Builder("http://localhost:8983/solr/update").build();
        String oid = Long.toString(id);
        solrClient.deleteById(oid);
        solrClient.commit();


    }
}
