FROM gradle:5.6-jdk12 as builder

WORKDIR /app

COPY src src
COPY settings.gradle .
COPY build.gradle .


RUN gradle jlink

#------------------------------------------
FROM panga/alpine:3.8-glibc2.27

COPY --from=builder /app/build/image /hello

EXPOSE 8080

CMD [ "/hello/bin/hello" ]
