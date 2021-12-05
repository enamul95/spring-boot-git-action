FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-github-action.jar spring-boot-github-action.jar
ENTRYPOINT ["java","-jar","/spring-boot-github-action.jar"]