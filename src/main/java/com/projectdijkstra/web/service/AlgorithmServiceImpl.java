package com.projectdijkstra.web.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import com.projectdijkstra.web.model.Algorithm;

@Service
@Profile("develop")
public class AlgorithmServiceImpl implements AlgorithmService {

  private final RestTemplate restTemplate = new RestTemplate();

  @Value("${dijkstra.api.host}")
  private String apiHost;
  
  @Override
  public Algorithm findAlgorithmByAlgorithmId(Integer algorithmId) {
    UriComponents uriComponents = UriComponentsBuilder.newInstance().scheme("http").host(apiHost)
        .path("/algorithms").queryParam("algorithm_id", algorithmId).build();
    return restTemplate.getForObject(uriComponents.toUriString(), Algorithm.class);
  };//;←意味ある？
  
  @Override
  public List<Algorithm> findAlgorithmList(){
	UriComponents uriComponents = UriComponentsBuilder.newInstance().scheme("http").host(apiHost)
			.path("/algorithms/list").build();
	return Arrays.stream(restTemplate.getForObject(uriComponents.toUriString(), Algorithm[].class))
			.collect(Collectors.toList());
  };
  

}
