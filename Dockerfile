FROM openjdk:17-slim-buster
WORKDIR /opt
COPY demo/build/libs/demo-0.0.1-SNAPSHOT.jar /opt/demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
