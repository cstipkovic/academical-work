#!/bin/bash

PROJECT_NAME="lab2"

docker image build \
    -t $PROJECT_NAME .

docker container rm \
    -f $PROJECT_NAME

docker container run \
    --restart=always \
    --name $PROJECT_NAME \
    -d $PROJECT_NAME