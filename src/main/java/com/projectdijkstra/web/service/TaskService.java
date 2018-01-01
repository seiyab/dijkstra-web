package com.projectdijkstra.web.service;

import java.util.List;
import com.projectdijkstra.web.model.Task;

public interface TaskService {
  public List<Task> findTasksByAlgorithmId(Integer algorithmId);
}
