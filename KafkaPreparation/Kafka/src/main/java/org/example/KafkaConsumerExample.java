package org.example;

import org.apache.kafka.clients.consumer.*;
import java.time.Duration;
import java.util.*;

public class KafkaConsumerExample {

    public static void main(String[] args) {

        Properties props = new Properties();

        // Kafka Broker
        props.put("bootstrap.servers", "localhost:9092");

        // Consumer Group
        props.put("group.id", "my-group");

        // Deserializer
        props.put("key.deserializer",
                "org.apache.kafka.common.serialization.StringDeserializer");

        props.put("value.deserializer",
                "org.apache.kafka.common.serialization.StringDeserializer");

        // Auto Offset
        props.put("auto.offset.reset", "earliest");

        KafkaConsumer<String, String> consumer =
                new KafkaConsumer<>(props);

        consumer.subscribe(Arrays.asList("test-topic"));

        System.out.println("Waiting for messages...");

        while (true) {

            ConsumerRecords<String, String> records =
                    consumer.poll(Duration.ofMillis(100));

            for (ConsumerRecord<String, String> record : records) {

                System.out.println("Received Message: "
                        + record.value());
            }
        }
    }
}
