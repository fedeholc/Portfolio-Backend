FROM amazoncorretto:11-alpine-jdk

MAINTAINER emaaristimuno

COPY target/portfolioapbackend-1.0.jar portfolioapbackend-1.0.jar

ENTRYPOINT ["java","-jar","/portfolioapbackend-1.0.jar"]
