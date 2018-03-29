#!/bin/bash

cp /home/deployer/application-product.yaml repo/src/main/resources/

mvn clean package -f repo/pom.xml

mv repo/target/dijkstra-web.jar jar/
