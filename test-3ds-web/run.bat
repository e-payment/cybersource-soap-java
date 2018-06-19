@echo off

:: mvn clean jetty:run
mvn jetty:run -Djava.net.preferIPv4Stack=true

@echo on