package com.dockerproiect.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")             //8082/hello/hello
public class Helloworld {

    @GetMapping("/hello")
    public ResponseEntity<String> getHelloWorld(){
        return new  ResponseEntity<>("Hello World!",HttpStatus.OK);
    }

}
