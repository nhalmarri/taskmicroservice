package com.example.account.bo;

public class Stock {

    //Am i suppose to leave the @Column ? before each variable ?

    private Long quantity;

    private String item;

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }



}//end of class
