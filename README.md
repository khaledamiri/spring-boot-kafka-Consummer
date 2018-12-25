https://dzone.com/articles/running-apache-kafka-on-windows-os
https://kafka.apache.org/quickstart

https://github.com/TechPrimers/spring-boot-kafka-producer-example (with same adaptation with version kafka kafka_2.11-2.1.0 ) 

# Spring Boot with Kafka Producer Example

This Project covers how to use Spring Boot with Spring Kafka to Publish JSON/String message to a Kafka topic
## Start Zookeeper
- `zkzervze`

## Start Kafka Server
- `C:\kafka\kafka\bin\windows\kafka-server-start.bat c:\kafka\kafka\config\server.properties`

## Create Kafka Topic
- `kafka-topics.bat --create --bootstrap-server localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example`

- `kafka-topics.bat --create --bootstrap-server localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example_json`


## Publish from the Kafka Topic via Console
- `kafka-console-producer.bat --broker-list localhost:9092 --topic Kafka_Example`
- `kafka-console-producer.bat --broker-list localhost:9092 --topic Kafka_Example_json`