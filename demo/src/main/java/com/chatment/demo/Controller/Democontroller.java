package com.chatment.demo.Controller;

import io.swagger.v3.oas.annotations.Parameter;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.chatment.demo.service.demoservice;


@RestController
@RequestMapping(value = "/api")
public class Democontroller {

    @Autowired
    private demoservice dmservice;

    @PostMapping(value = "/Demo/{animal}")
    public String getresponseforcat(@Parameter(required = true) @PathVariable String animal){
        if(animal.equalsIgnoreCase("cat")){
            return dmservice.cat();
        }
        else if (animal.equalsIgnoreCase("dog")){
            return dmservice.dog();
        }
        else
            return "Animal Not in DB";

//        return (new Response(ApiCallResponseStatus.SUCCESS));
    }
}
