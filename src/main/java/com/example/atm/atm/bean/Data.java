package com.example.atm.atm.bean;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

//"BrandName":"Lloyds Bank",
//        "ATM":[
//        {
//        "Identification":"LFFFBC11",
//        "SupportedCurrencies":[
//        "GBP"
//        ],
//        "Location":{
//        "PostalAddress":{
//        "AddressLine":[
//        "1 VICTORIA ROAD;"
//        ],
//        "StreetName":"1 VICTORIA ROAD",
//        "TownName":"CONSETT",
//        "CountrySubDivision":[
//        "COUNTY DURHAM"
//        ],
//        "Country":"GB",
//        "PostCode":"DH8 5AE"
//        }
//        }
//        }
@lombok.Data
@JsonClassDescription
public class Data {
    @JsonProperty("Brand")
    List<Brand> brand;
}
