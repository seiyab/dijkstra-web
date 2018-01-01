package com.projectdijkstra.web.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Task {

  private String contest;
  private String task;
  private String url;
}
