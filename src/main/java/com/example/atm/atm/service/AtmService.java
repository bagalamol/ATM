package com.example.atm.atm.service;

import com.example.atm.atm.bean.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AtmService {
    @Autowired
    RestTemplate restTemplate;

    Logger logger = LoggerFactory.getLogger(AtmService.class);

    public static final String endpoint = "https://api.lloydsbank.com/open-banking/v2.2/atms";

    public Response getMachineDetails() throws JsonProcessingException {
        ObjectMapper objectMapper= new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        String response = restTemplate.getForObject(endpoint, String.class);
        Response response1 = objectMapper.readValue(response, Response.class);
        logger.info("Response: ", response1);
        return response1;
    }
}
