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
import com.projectdijkstra.web.model.Task;

@Service
@Profile("develop")
public class TaskServiceImpl implements TaskService {

  private final RestTemplate restTemplate = new RestTemplate();

  @Value("${dijkstra.api.host}")
  private String apiHost;

  @Override
  public List<Task> findTasksByAlgorithmId(Integer algorithmId) {
    UriComponents uriComponents = UriComponentsBuilder.newInstance().scheme("http").host(apiHost)
        .path("/tasks").queryParam("algorithm_id", algorithmId).build();
    return Arrays.stream(restTemplate.getForObject(uriComponents.toUriString(), Task[].class))
        .collect(Collectors.toList());
  }

}
