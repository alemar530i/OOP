/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.anothershop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class Stock extends StockItem{
    List<StockItem> stockItems = new ArrayList<>();
    public void Add(Product product,int quantity)
    {
        
        StockItem item = new StockItem();
        item.setStockItem(product, quantity);
        stockItems.add(item);
    }
    public void Remove(Product product,int quantity)
    {
        
        
    }
    public void UpdateProductPrice(Product product,double price)
    {
        for(int i=0; i<stockItems.size();i++)
        {
            if(stockItems.get(i).getProductName().equals(product.getProductName()))
                {
                        stockItems.get(i).setProductPrice(price);
                }
        }
    }
}
