package com.nora.orderstock.controller;

import com.nora.orderstock.bo.AccountResponse;
import com.nora.orderstock.entity.StockEntity;
import com.nora.orderstock.repository.StockRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountController {
    private final StockRepository stockRepository;

    public AccountController(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @GetMapping("/account")
    public AccountResponse stockDetails() {

        List<StockEntity> getStocks = new ArrayList<>((Collection<? extends StockEntity>) stockRepository.findAll());
        AccountResponse stockStatus = new AccountResponse();

        stockStatus.setStock(getStocks);
        return stockStatus;
    }





}//end of class
