package com.projectdijkstra.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Tests {

  private List<Test> list = new ArrayList<>();

  public Tests() {}

  public Tests(List<Test> TestList) {
    list.addAll(TestList);
  }

  public List<Test> request() {
    return Collections.unmodifiableList(list);
  }

  public int size() {
    return list.size();
  }

  public Iterator<Test> iterator() {
    return list.iterator();
  }

  public Tests[] toArray() {
    return list.toArray(new Tests[size()]);
  }
}
