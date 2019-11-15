# Start with a base image containing Java runtime
FROM openjdk:8-jre-stretch

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS
ENV JAVA_OPTS "-Xmx256m -Xms128m"

RUN rm -f /etc/localtime \
    && ln -s /usr/share/zoneinfo/America/Sao_Paulo /etc/localtime

RUN useradd -s /bin/bash zuul
RUN mkdir -p /home/zuul
RUN chown zuul:zuul /home/zuul

# Add Maintainer Info
LABEL maintainer="hac.handerson@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 9091 available to the world outside this container
EXPOSE 9091

# The application's jar file
ARG JAR_FILE=target/*.jar

# Add the application's jar to the container
ADD ${JAR_FILE} /home/zuul/app.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/home/zuul/app.jar"]