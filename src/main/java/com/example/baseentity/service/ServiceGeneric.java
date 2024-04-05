package com.example.baseentity.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceGeneric<T> {

    public void findById(T t) {
        System.out.println(t.toString());
    }
}
