package com.github.braincode17.giftapp;

public class SingleItem {

    private String itemId;
    private String itemImage;
    private String itemTitle;
    private String itemPrice;
    private String shippingPrice;
    private String shippingTime;

    public SingleItem(String itemTitle){
        this.itemTitle=itemTitle;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemImage() {
        return itemImage;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public String getShippingPrice() {
        return shippingPrice;
    }

    public String getShippingTime() {
        return shippingTime;
    }
}
