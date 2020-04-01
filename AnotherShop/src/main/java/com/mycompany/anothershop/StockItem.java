/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.anothershop;

/**
 *
 * @author Alex
 */
public class StockItem extends Product {
    //Product product;
    int quantity;
    public void setStockItem(Product product,int quantity)
    {
        this.setProductName(product.getProductName());
        this.setProductPrice(product.getProductPrice());
        this.quantity = quantity;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public Product getProduct()
    {
        return this.getProductInfo();
    }
}
