# Console app to read a file with an executable JAR using Maven plugin
boilerplate Java code for reading an input file and make an executable jar

## Instructions
Steps how to create a jar executable file, using the maven jar plugin:
https://www.hellocodeclub.com/maven-jar-plugin-how-to-make-an-executable-jar-file/

1. Download or clone the repository code and run 
   cd cli-converter 
2. Run
   `mvn clean install` then press an Enter, and
   `mvn clean package` then press an Enter, and
   `java -jar target/cliconverter-jar-with-dependencies.jar` then press an Enter

I have found the correct configuration for Maven Assembly plugin to create an executable JAR with all dependencies needed in POM for the project.
For example Log4j library for logging.
The best reference has been found at https://stackoverflow.com/a/27662742/11889789