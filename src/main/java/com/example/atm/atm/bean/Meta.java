package com.example.atm.atm.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Meta {
    @JsonProperty
    private String LastUpdated;
    @JsonProperty
    private double TotalResults;
    @JsonProperty
    private String Agreement;
    @JsonProperty
    private String License;
    @JsonProperty
    private String TermsOfUse;
}
