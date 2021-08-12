FROM openjdk:8-jdk-alpine
LABEL maintainer="litecj702@gmail.com"
VOLUME /main-app
ADD build/libs/demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://root:root@mongo:27017/mydb?authSource=admin","-jar","app.jar"]
#ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongo:27017/mydb","-jar","app.jar"]
