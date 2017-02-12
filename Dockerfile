FROM openjdk:8u111-jdk-alpine
VOLUME /tmp
ADD /target/hello-microservice-0.0.1.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]