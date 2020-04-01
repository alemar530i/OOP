/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.anothershop;


import java.util.Map;

/**
 *
 * @author Alex
 */
public class Product {
    private String name;
    Map<String,String> characteristics;
    String description;
    private double price;
    public void setProduct(String _name, double _price)
    {
        this.name=_name;
        this.price = _price;
    }
    public void setProductPrice(double price)
    {
        this.price= price;
    }
    public void setProductName(String name)
    {
        this.name= name;
    }
    public String getProductName()
    {
        return this.name;
    }
     public double getProductPrice()
    {
        return this.price;
    }
     public Product getProductInfo()
     {
         return this;
     }
}
