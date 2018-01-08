package com.projectdijkstra.web.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import com.projectdijkstra.web.model.Algorithm;

@Service
@Profile("develop")
public class AlgorithmServiceImpl {

  private final RestTemplate restTemplate = new RestTemplate();

  @Value("${dijkstra.api.host}")
  private String apiHost;

  public Algorithm findAlgorithmByAlgorithmId(Integer algorithmId) {
    UriComponents uriComponents = UriComponentsBuilder.newInstance().scheme("http").host(apiHost)
        .path("/algorithms").queryParam("algorithm_id", algorithmId).build();
    return restTemplate.getForObject(uriComponents.toUriString(), Algorithm.class);
  };
}
