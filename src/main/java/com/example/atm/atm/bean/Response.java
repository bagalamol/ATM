package com.example.atm.atm.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@lombok.Data
public class Response {
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("data")
    private List<Data> data;
}
