FROM openjdk:8

ADD target/docker-spring-boot.jar docker-spring-boot.jar
COPY . /app
EXPOSE 8080

ENTRYPOINT ["java","-jar","docker-spring-boot.jar"]