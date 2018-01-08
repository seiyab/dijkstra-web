package com.projectdijkstra.web.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import com.projectdijkstra.web.model.Algorithm;

@Service
@Profile("local")
public class AlgorithmServiceLocalImpl implements AlgorithmService {

  @Override
  public Algorithm findAlgorithmByAlgorithmId(Integer algorithmId) {
    return Algorithm.builder().algorithmId(algorithmId).name("動的計画法").build();
  }

}
