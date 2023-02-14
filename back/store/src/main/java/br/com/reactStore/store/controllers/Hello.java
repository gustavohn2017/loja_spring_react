package br.com.reactStore.store.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Hello {
    @RequestMapping("/")
        public String hello(){
            return "CHUPA JAVA OTÁRIO "+ new Date();
        }
    }
    
