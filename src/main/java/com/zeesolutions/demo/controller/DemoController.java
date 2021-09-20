package com.zeesolutions.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @Value("${demo.prop}")
  private String message;

  @GetMapping
  public ResponseEntity<String> getDemoResponse(){
    return new ResponseEntity<>(message, HttpStatus.OK);
  }
}
