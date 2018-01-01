package com.projectdijkstra.web.service;

import com.projectdijkstra.web.model.Algorithm;

public interface AlgorithmService {
  Algorithm findAlgorithmByAlgorithmId(Integer algorithmId);
}
