package com.projectdijkstra.web.service;

import java.util.List;

import com.projectdijkstra.web.model.Algorithm;

public interface AlgorithmService {
  public Algorithm findAlgorithmByAlgorithmId(Integer algorithmId);
  public List<Algorithm> findAlgorithmList();
}
