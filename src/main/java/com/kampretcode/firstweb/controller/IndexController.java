package com.kampretcode.firstweb.controller;

import com.kampretcode.firstweb.model.Product;
import com.kampretcode.firstweb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "Hello Worldas asd dasdasasdasd123";
    }

    @RequestMapping("/test-create")
    @ResponseBody
    public String testCeate(){
        Product product = productRepository.save(new Product("test product"));
        return "test create";
    }

}
