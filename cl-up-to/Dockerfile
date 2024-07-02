FROM maven:3.6.3-openjdk-17-slim AS MAVEN_BUILD

COPY ./pom.xml /app/

COPY ./src /app/src/

WORKDIR /app

RUN mvn clean verify --fail-never

RUN mvn compile package

FROM openjdk:17-jdk-alpine3.14

COPY --from=MAVEN_BUILD /app/target/cl*.jar /cl.jar

ENTRYPOINT ["java", "-jar", "/cl.jar"]
#COPY ./entrypoint.sh /
#ENTRYPOINT ["sh", "/entrypoint.sh"]
