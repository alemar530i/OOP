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
public class Receipt {
    List<ReceiptItem> receiptItems = new ArrayList<>();
    public double getTotal()
    {
        double total=0;
            for(int i=0;i<receiptItems.size();i++)
            {
                total = total+this.getTotalForProduct(i);
            }

        return total;
    }
    public double getTotalForProduct(int i)
    {
        double sum=0;
           sum =  receiptItems.get(i).GetppUnit() * receiptItems.get(i).GetQuant();
           receiptItems.get(i).SetTotal(sum);
         return sum; 
    }
}
