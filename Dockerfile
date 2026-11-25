# jdk 17 version 사용
FROM eclipse-temurin:17-jdk

# 빌드된 JAR 복사
COPY build/libs/*SNAPSHOT.jar app.jar

# port open
EXPOSE 8080

# jar run
ENTRYPOINT ["java", "-jar", "/app.jar"]

