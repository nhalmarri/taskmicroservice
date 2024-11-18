package com.nora.orderstock.service;

import com.nora.orderstock.bo.CreateStockRequest;
import com.nora.orderstock.bo.UpdateStockResponse;

public interface StockService {

    UpdateStockResponse updateStock(CreateStockRequest request);

    void addItems(CreateStockRequest stock);
}