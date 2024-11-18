package com.example.account.controller;

import com.example.account.bo.AccountResponse;
import com.example.account.bo.Stock;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api")
public class accountController {
    // Since it is a GET request it should not have a body
    // (no data in a JSON object in the body of the HTTP request).

    private final RestTemplate restTemplate;
    private static final String STOCK_API = "http://localhost:8080/api/account";



    public accountController(RestTemplate restTemplate) {

        this.restTemplate = restTemplate;
    }

    @GetMapping("/account")
    public AccountResponse getstock() {

        ResponseEntity<AccountResponse> responseEntity = restTemplate.getForEntity(STOCK_API, AccountResponse.class);
        AccountResponse stockStatus = responseEntity.getBody();


        return stockStatus;
    }



//    @GetMapping("/account")
//    public AccountResponse getStocks() {
//        ResponseEntity<List<Stock>> responseEntity = restTemplate.exchange(
//                STOCK_API,
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<Stock>>() {}
//        );
//
//        List<Stock> stocks = responseEntity.getBody();
//
//        AccountResponse accountResponse = new AccountResponse(stocks);
//
//        return accountResponse;
//    }
//


}//end of class
