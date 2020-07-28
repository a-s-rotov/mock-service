package com.petproject.mockservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/config")
public class ConfigurationController {

  @RequestMapping("/")
  public ModelAndView greeting() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("index");
    return modelAndView;
  }
}
