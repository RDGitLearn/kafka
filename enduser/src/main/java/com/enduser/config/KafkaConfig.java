package com.enduser.config;

import com.enduser.utils.Constants;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {


    @KafkaListener(topics = Constants.LOC_UPDATE_TOPIC,groupId = Constants.GROUP_ID)
    public void updateLocation(String value){
        System.out.println(value);
    }
}
