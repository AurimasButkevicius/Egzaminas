#!/bin/sh
mvn clean install spring-boot:run -Dspring-boot.run.arguments=--server.port=8081
mvn clean install org.codehaus.cargo:cargo-maven2-plugin:1.7.7:run \
-Dcargo.maven.containerId=tomcat9x -Dcargo.servlet.port=8081 \
-Dcargo.maven.containerUrl=http://repo1.maven.org/maven2/org/apache/tomcat/tomcat/9.0.29/tomcat-9.0.29.zip
