FROM amazoncorretto:11
ARG JAR_FILE=target/*.jar
COPY ./target/discovery-service-1.0-SNAPSHOT.jar discovery-service.jar
ENTRYPOINT ["java", "-jar", "/discovery-service.jar"]
