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
public class ReceiptItem {
    private String productName;
    private double ppUnit;
    private int quantity;
    private double total;
    
    public String GetName()
    {
        return productName;
    }
    public double GetppUnit()
    {
       return ppUnit;
    }
    public int GetQuant()
    {
        return quantity;
    }
    public double GetTotal()
    {
        return total;
    }
    
    public void SetName(String name)
    {
        this.productName = name;
    }
    public void SetppUnit(double price)
    {
        this.ppUnit = price;
    }
    public void SetQuant(int quant)
    {
        this.quantity = quant;
    }
    public void SetTotal(double total)
    {
        this.total = total;
    }
}
