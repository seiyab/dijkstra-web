#!/bin/bash

set -e -u -x -o

ssh target /usr/bin/git --git-dir=/home/app/dijkstra-web pull origin master
ssh target /bin/npm install --only=production --prefix /home/app/dijkstra-web
ssh target /bin/npm run build --prefix /home/app/dijkstra-web
