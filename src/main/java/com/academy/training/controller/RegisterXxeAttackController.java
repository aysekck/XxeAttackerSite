package com.academy.training.controller;

import org.springframework.http.ResponseEntity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RegisterXxeAttackController {

    protected static final Logger logger = LogManager.getLogger();

    @GetMapping(value = "/registerxxeattack", produces = "text/html")
    public ResponseEntity<String> registerXxeAttack() {

       logger.info("Http request in !DOCTYPE element in xml is executed!");

       return ResponseEntity.ok("ok") ;
    }

}
