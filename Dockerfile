FROM openjdk:8
EXPOSE 8081
ADD target/sample-app.jar sample-app.jar
ENTRYPOINT ["java","-jar","sample-app.jar"]