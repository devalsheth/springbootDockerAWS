FROM anapsix/alpine-java
VOLUME /tmp
RUN apk add --update curl && rm -rf /var/cache/apk/*
ADD springDockerTest.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]