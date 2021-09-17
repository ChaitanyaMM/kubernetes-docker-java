FROM amazoncorretto:11-alpine-jdk
MAINTAINER chaitanya
COPY target/kubernetes-docker-java-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
