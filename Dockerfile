FROM openjdk:8-jdk-alpine

EXPOSE 8080

ADD ./target/wimb-0.0.1-SNAPSHOT.jar wimb.jar

ENTRYPOINT ["java", "-jar", "wimb.jar"]

