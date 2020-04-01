/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.anothershop;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Seller extends EmployeeInfo {
   
     public Seller(String name)
    {
        this.name = name;
    }
    public  int checkProductStock(Stock stock,String name,int quantity)
    {
        int noItems = -1;
        for(int i=0;i<stock.stockItems.size();i++)
        {
            if(stock.stockItems.get(i).getProductName().equals(name))
            {
                
                if(stock.stockItems.get(i).quantity>=quantity)
                    noItems = stock.stockItems.get(i).quantity;
            }  
        }
        return noItems;
    }
    public double Sell(CashRegister register,Stock stock,List<ReceiptItem> products)
    {
        double total=0;
        total = register.finalizeSell(stock,register.receipts.get(register.currentReceipt));
        register.currentReceipt++;
        return total;
    }
}
