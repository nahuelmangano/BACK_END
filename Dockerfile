FROM amazoncorretto:11-alpine-jdk
MAINTAINER NahuelMangano
COPY target/portfolio_ArgentinaPrograma-0.0.1-SNAPSHOT.jar nahuel-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/nahuel-app.jar"]