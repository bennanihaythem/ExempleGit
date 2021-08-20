FROM openjdk:8
EXPOSE 8080
ADD target/exemple-git.jar exemple-git.jar
ENTRYPOINT["java","-jar","/exemple-git"]