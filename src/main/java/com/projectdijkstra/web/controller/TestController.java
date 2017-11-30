package com.projectdijkstra.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import com.projectdijkstra.model.TestModel;

@Controller
public class TestController {
  @PostMapping(path = "/test")
  String create(@Validated TestModel model) { // 引数として直接受け取れる
    return "test";
  }
}
