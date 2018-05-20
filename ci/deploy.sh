#!/bin/bash

set -e -u -x -o

ssh target sudo systemctl restart dijkstra-web
