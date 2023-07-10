FROM amazoncorretto:11
ARG JAR_FILE=target/*.jar
COPY ./target/song-service-0.0.1-SNAPSHOT.jar song-service.jar
ENTRYPOINT ["java", "-jar", "/song-service.jar"]
