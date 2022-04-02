package com.example.atm.atm.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Brand {
    @JsonProperty("BrandName")
    private String BrandName;
    @JsonProperty("Branch")
    List<Branch> branches;
}
