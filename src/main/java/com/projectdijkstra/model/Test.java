package com.projectdijkstra.model;

import lombok.Getter;
import lombok.Setter;

public class Test {
  @Setter
  @Getter
  private String algo;

  @Getter
  @Setter
  private String url;

  public Test() {
    this.algo = "algo";
    this.url = "url";
  }

  public Test(String algo, String url) {
    setAlgo(algo);
    setUrl(url);
  }

  public String toStr() {

    return "algo: " + this.algo + ", url: " + this.url;
  }

}
