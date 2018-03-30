#!/bin/bash
scp jar/dijkstra-web.jar target:~/jar/ \ &&
ssh sudo systemctl restart dijkstra-web
