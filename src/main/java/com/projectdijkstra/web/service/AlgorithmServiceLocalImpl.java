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
  public List<Algorithm> findAlgorithmList(){
	List<Algorithm> algorithms = new LinkedList<>();
	algorithms.add(Algorithm.builder().algorithmId(1).name("アルゴリズム").build());
	return algorithms;
  }

  
}
