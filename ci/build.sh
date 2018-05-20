#!/bin/bash

set -e -u -x -o

ssh target /usr/bin/git pull origin master --git-dir=/home/app/dijkstra-web
ssh target /bin/npm install --only=production --prefix /home/app/dijkstra-web
ssh target /bin/npm run build --prefix /home/app/dijkstra-web
