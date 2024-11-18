package com.nora.orderstock.bo;

import com.nora.orderstock.entity.StockEntity;

import java.util.List;

public class AccountResponse {

    private List<StockEntity> Stock;

    public AccountResponse(){}

    public AccountResponse(List<StockEntity> stock) {
        this.Stock = stock;
    }

    public List<StockEntity> getStock() {
        return Stock;
    }

    public void setStock(List<StockEntity> stock) {
        Stock = stock;
    }







}//end of class
