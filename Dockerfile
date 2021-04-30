FROM openjdk:8-jdk-alpine

COPY target/fincore-*.jar /fincore.jar

CMD ["java", "-jar", "/fincore.jar"]