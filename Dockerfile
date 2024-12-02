FROM openjdk:17-jdk-slim

COPY ./target/rewards-0.0.1-SNAPSHOT.jar /usr/app/
COPY ./wait-for-it.sh /usr/app/wait-for-it.sh
# RUN apt-get update && apt-get upgrade && apt-get dist-upgrade
# RUN apt-get install netcat -y

WORKDIR /usr/app

run sh -c 'touch rewards-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["sh", "wait-for-it.sh", "mongodb"]
#ENTRYPOINT ["java", "-jar", "rewards-0.0.1-SNAPSHOT.jar"]