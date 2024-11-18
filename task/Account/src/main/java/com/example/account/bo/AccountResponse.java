package com.example.account.bo;

import java.util.List;

public class AccountResponse {

    private List<Stock> Stock;

    public AccountResponse(){}

    public AccountResponse(List<Stock> stock) {
        Stock = stock;
    }

    public List<Stock> getStock() {
        return Stock;
    }

    public void setStock(List<Stock> stock) {
        Stock = stock;
    }

}//end of class
