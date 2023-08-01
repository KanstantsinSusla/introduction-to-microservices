FROM amazoncorretto:11
ARG JAR_FILE=target/*.jar
COPY ./target/resource-service-0.0.1-SNAPSHOT.jar resource-service.jar
ENTRYPOINT ["java", "-jar", "/resource-service.jar"]
