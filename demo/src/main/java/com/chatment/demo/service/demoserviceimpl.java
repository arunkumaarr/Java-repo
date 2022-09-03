package com.chatment.demo.service;

import org.springframework.stereotype.Service;

@Service
public class demoserviceimpl implements demoservice{

    @Override
    public String dog() {
        return new String("Bow Bow");

    }

    @Override
    public String cat() {
        return new String("Meow Meow");

    }

}
