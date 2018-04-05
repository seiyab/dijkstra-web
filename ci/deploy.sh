#!/bin/bash

set -e -u -x -o

scp jar/dijkstra-web.jar target:jar/ 

ssh target sudo systemctl restart dijkstra-web
