FROM openjdk:8
EXPOSE 8088
ADD target/*.war exemple-git.war
USER nobody
ENTRYPOINT ["java","-war","./exemple-git.war"]