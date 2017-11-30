package com.projectdijkstra.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.projectdijkstra.entity.Test;

@Controller
public class TestController {
  /*
   * 文字列の返事
   */
  @RequestMapping("/test/array")
  @ResponseBody
  public String arrayR() {
    return "Hello Spring Boot!!";
  }

  /*
   *
   */
  @RequestMapping(value = "/getParam")
  @ResponseBody
  public String getParam(@RequestParam String algo, Test testmodel) {
    /*
     * testmodel.addAttribute("modelFoo", algo); testmodel.addAttribute("modelBar", url);
     */
    return algo;
  }
}
