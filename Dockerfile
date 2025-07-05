FROM amazoncorretto:17-alpine-jdk
LABEL maintainer="Hrishikesh Bhorde"
COPY target/flyway-demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]




