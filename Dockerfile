FROM openjdk:8
EXPOSE 8088
ADD target/*. exemple-git.jar
USER nobody
ENTRYPOINT ["java","-jar","./exemple-git.jar"]