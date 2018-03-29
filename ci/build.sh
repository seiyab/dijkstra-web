#!/bin/bash

mvn clean package -f repo/pom.xml -Pconcourse

mv ./target/dijkstra-web.jar jar/
