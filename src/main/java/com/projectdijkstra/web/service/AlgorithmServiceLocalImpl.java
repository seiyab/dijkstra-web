package com.projectdijkstra.web.service;

import java.util.LinkedList;
import java.util.List;
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

  @Override
  public List<Algorithm> findAlgorithmList() {
    List<Algorithm> algorithms = new LinkedList<>();
    algorithms.add(Algorithm.builder().algorithmId(1).name("アルゴリズム1").build());
    algorithms.add(Algorithm.builder().algorithmId(2).name("アルゴリズム2").build());
    algorithms.add(Algorithm.builder().algorithmId(3).name("アルゴリズム3").build());
    algorithms.add(Algorithm.builder().algorithmId(4).name("アルゴリズム4").build());
    algorithms.add(Algorithm.builder().algorithmId(5).name("アルゴリズム5").build());
    algorithms.add(Algorithm.builder().algorithmId(6).name("アルゴリズム6").build());
    algorithms.add(Algorithm.builder().algorithmId(7).name("アルゴリズム7").build());
    return algorithms;
  }
}
