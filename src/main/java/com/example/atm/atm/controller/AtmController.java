package com.example.atm.atm.controller;

import com.example.atm.atm.bean.Response;
import com.example.atm.atm.service.AtmService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtmController {

    @Autowired
    AtmService atmService;

    Logger logger = LoggerFactory.getLogger(AtmService.class);

    @GetMapping("/getMachineDetails/{identification}")
    public void getMachineDetail(@PathVariable("identification") String identification) {}

    @GetMapping("/getMachineDetails")
    @ResponseStatus(HttpStatus.OK)
    public Response getMachineDetails() throws JsonProcessingException {
        logger.info("invoke /getMachineDetails");
        return atmService.getMachineDetails();
    }
}
