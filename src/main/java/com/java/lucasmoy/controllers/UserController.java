package com.java.lucasmoy.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  //usuário

  @RequestMapping(value = "test")
  public String test() {
    //prueba
    return "test";
  }
}
