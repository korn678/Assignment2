FROM tomcat:8.5.45-jdk13-openjdk-oracle
LABEL maintainer="group1"
EXPOSE 8080
USER root
COPY tomcat-users.xml /usr/local/tomcat/conf
COPY context.xml /usr/local/tomcat/webapps/manager/META-INF
COPY *.war /target /usr/local/tomcat/webapps