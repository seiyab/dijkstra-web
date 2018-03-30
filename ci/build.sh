#!/bin/bash

mvn clean package -f repo/pom.xml

mv repo/target/dijkstra-web.jar jar/
