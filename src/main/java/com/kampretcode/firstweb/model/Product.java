package com.kampretcode.firstweb.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
    private String id;
    private final String name;

    public Product(String paramName){
        name = paramName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id){
        this.id = id;
    }
}
