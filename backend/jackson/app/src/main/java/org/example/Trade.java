package org.example;

public class Trade {
    public String symbol;
    public String purchaseDate;
    public int quantity;

    public Trade() {
    }

    public Trade(String symbol, String purchaseDate, int quantity) {
        this.symbol = symbol;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Trade [symbol=" + symbol + ", purchaseDate=" + purchaseDate + ", quantity=" + quantity + "]";
    }

}
