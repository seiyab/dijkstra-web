package com.projectdijkstra.web.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Algorithm {
  @JsonProperty("algorithm_id")
  private Integer algorithmId;
  private String name;
}
