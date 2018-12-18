#!/bin/sh

#Build EAR
./gradlew ear

#Delete the older container if exist
docker container rm cars-commerce

#Build Docker image
docker build --no-cache -t cars-commerce:1.0.0 .

#Launch Docker image
docker run -p 8080:8080 -p 9990:9990 -p 8082:8082 --name cars-commerce cars-commerce:1.0.0
