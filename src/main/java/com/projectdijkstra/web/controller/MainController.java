package com.projectdijkstra.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String index() {
    return this.about();
  }

  @GetMapping("/algorithms")
  public String algorithms() {
    return "algorithms";
  }

  @GetMapping("/about")
  public String about() {
    return "about";
  }

  @GetMapping("/serp_task")
  public String serpTask() {
    return "serp_task";
  }
}
