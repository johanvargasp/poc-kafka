FROM openjdk:8
VOLUME /tmp
ADD ./target/poc-kafka-0.0.1-SNAPSHOT.jar poc-kafka-0.0.1-SNAPSHOT.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar","poc-kafka-0.0.1-SNAPSHOT.jar"]
