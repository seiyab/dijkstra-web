package com.projectdijkstra.web.service;

import java.util.LinkedList;
import java.util.List;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import com.projectdijkstra.web.model.Task;

@Service
@Profile("local")
public class TaskServiceLocalImpl implements TaskService {

  @Override
  public List<Task> findTasksByAlgorithmId(Integer algorithmId) {
    List<Task> tasks = new LinkedList<>();
    tasks.add(Task.builder().contest("Contest1").task("task1").url("/").build());
    tasks.add(Task.builder().contest("Contest2").task("task2").url("http://atcoder.jp").build());
    tasks.add(Task.builder().contest("Contest3").task("task3").url("http://github.com").build());
    return tasks;
  }

}
