package com.deliverybody.service;

import com.deliverybody.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String,String> template ;

    Logger logger = LoggerFactory.getLogger(KafkaService.class);
    public boolean updateLocation(String location){
        this.template.send(Constants.LOC_UPDATE_TOPIC,location);
        logger.info("Message produced.");
        return true;

    }
}
