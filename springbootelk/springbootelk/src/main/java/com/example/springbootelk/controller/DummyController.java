package com.example.springbootelk.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    private final Logger log = LogManager.getLogger(DummyController.class);

    @GetMapping(path = "/up")
    ResponseEntity<String> isUp(){
        log.info("is up and running");
        return ResponseEntity.ok("up and running!");
    }
}
