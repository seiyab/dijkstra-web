package com.projectdijkstra.web.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Algorithm {
  private Integer algorithmId;
  private String name;
}
