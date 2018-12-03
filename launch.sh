#!/bin/sh

#Build EAR
./gradlew ear

#Build Docker image
docker build -t cars-commerce:1.0.0 .

#Launch Docker image
docker run -p 8080:8080 -p 9990:9990 -p 8082:8082 cars-commerce:1.0.0
