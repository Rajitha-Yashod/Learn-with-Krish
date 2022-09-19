package com.FuelManagement.DispatchService.KafkaConfiguration;

import com.FuelManagement.DispatchService.DispatchEntity.Schedule;
import com.google.gson.JsonSerializer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

public class Producer {
    @Bean
    public Map<String, Object> producerConfig(){
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return props;
    }

//    Producer Factory which responsible for creating producer instances
//    todo: Change String to Object Which we want to send

    @Bean
    public ProducerFactory<String, Schedule> producerFactory(){
        return new DefaultKafkaProducerFactory<>(producerConfig());
    }

//    todo: Change String to Object Which we want to send

    @Bean
    public KafkaTemplate<String, Schedule> KafkaTemplate(
            ProducerFactory<String, Schedule> producerFactory
    ) {
        return new KafkaTemplate<>(producerFactory);
    }
}
