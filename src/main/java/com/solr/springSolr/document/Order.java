package com.solr.springSolr.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "Order")
public class Order {

    @Id
    @Indexed(name = "oid", type = "long")
    private Long orderid;

    @Indexed(name = "oname", type = "string")
    private String orderName;

    @Indexed(name = "odesc", type = "string")
    private String orderDescription;

    @Indexed(name = "pname", type = "string")
    private String productName;

    @Indexed(name = "cname", type = "string")
    private String customerName;

    @Indexed(name = "cmobile", type = "string")
    private String customerMobile;


    //Getter and Setter


    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }
}
