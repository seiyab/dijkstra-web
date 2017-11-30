package com.projectdijkstra.model;

public class TestModel {
  private String algo;
  private String url;

  public TestModel() {
    this.algo = "algo";
    this.url = "url";
  }

  public TestModel(String algo, String url) {
    setAlgo(algo);
    setUrl(url);
  }

  public void setAlgo(String algo) {
    this.algo = algo;
  }

  public String getAlgo() {
    return algo;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }



}
