FROM amazoncorretto:21-alpine-jdk
COPY target/student-management-app.jar student-management-app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "student-management-app.jar" ]
