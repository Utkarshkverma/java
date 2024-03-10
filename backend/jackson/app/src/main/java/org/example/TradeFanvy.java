package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TradeFanvy {
    @JsonProperty("1. symbol")
    public String symbol;
    @JsonProperty("3. purchaseDate")
    public String purchaseDate;
    @JsonProperty("2. quantity")
    public int quantity;


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
