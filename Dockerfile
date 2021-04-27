FROM openjdk:8
EXPOSE 8080
ADD target/springboot-docker-aws-ecs.jar springboot-docker-aws-ecs.jar
ENTRYPOINT ["java","-jar","/springboot-docker-aws-ecs.jar"]