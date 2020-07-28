package com.petproject.mockservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmulatorController {

  @RequestMapping("**")
  public String handler() {
    return "-";
  }
}
