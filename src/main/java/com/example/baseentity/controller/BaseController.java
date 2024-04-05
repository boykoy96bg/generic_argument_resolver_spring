package com.example.baseentity.controller;

import com.example.baseentity.service.ServiceGeneric;
import com.example.baseentity.resolver.IDResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController <ID> {

    @Autowired
    ServiceGeneric<ID> serviceGeneric;

    @PostMapping
    public void findById(IDResolver<ID> idResolver){
        System.out.println(idResolver.toString());
        serviceGeneric.findById(idResolver.getId());
    }
}
