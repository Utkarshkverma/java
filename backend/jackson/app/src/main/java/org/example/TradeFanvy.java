package org.example;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties({"sendinDate","receivigDate"}) // todo  : to ignore the multiple field
@JsonPropertyOrder({"symbol","purchaseDate","quantity"}) // todo  : to send the json file in the order decideded by us
@JsonInclude(value =  JsonInclude.Include.NON_EMPTY)   //todo: To include only non null value in json object
public class TradeFanvy {
    @JsonProperty("1. symbol")
    public String symbol;
    @JsonProperty("3. purchaseDate")
    public String purchaseDate;
    @JsonProperty("2. quantity")
    public int quantity;
    @JsonIgnore // todo : Ignore one property
    public  double price;

    public int sendingDate;
    public int receivingDate;


    public TradeFanvy() {
    }


    public TradeFanvy(String symbol, String purchaseDate, int quantity) {
        this.symbol = symbol;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "TradeFanvy [symbol=" + symbol + ", purchaseDate=" + purchaseDate + ", quantity=" + quantity + "]";
    }



    
}
