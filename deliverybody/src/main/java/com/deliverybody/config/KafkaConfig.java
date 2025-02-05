package com.deliverybody.config;

import com.deliverybody.util.Constants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    public NewTopic topic(){
        return TopicBuilder.name(Constants.LOC_UPDATE_TOPIC).build();
    }
}
