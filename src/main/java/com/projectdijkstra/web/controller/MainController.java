package com.projectdijkstra.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.projectdijkstra.web.model.Algorithm;
import com.projectdijkstra.web.model.Task;
import com.projectdijkstra.web.service.AlgorithmService;
import com.projectdijkstra.web.service.TaskService;

@Controller
public class MainController {
  @Autowired
  TaskService taskService;

  @Autowired
  AlgorithmService algorithmService;

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
  public String serpTask(Model model, @RequestParam("algorithm_id") Integer algorithmId) {
    Algorithm algorithm = algorithmService.findAlgorithmByAlgorithmId(algorithmId);
    model.addAttribute("algorithm", algorithm);

    List<Task> tasks = taskService.findTasksByAlgorithmId(algorithmId);
    model.addAttribute("tasks", tasks);

    return "serp_task";
  }
}
