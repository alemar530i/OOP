/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.anothershop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Store store = new Store("Domino's");
        
        store.addNewAdmin("Gary");
        store.addNewSeller("The other Gary");
        store.addNewCashRegister(1);
        Product product = new Product();
        product.setProduct("Pizza", 10);
        store.admins.get(0).addProductsToStock(store.stock, product, 2);
        product.setProduct("Taco", 3);
        store.admins.get(0).addProductsToStock(store.stock, product, 5);
        
        List<ReceiptItem> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;
        store.cashRegisters.get(0).startNewSell();
        System.out.print("We have: ");
        for(int i=0;i<store.stock.stockItems.size();i++)
        {
            System.out.print(store.stock.stockItems.get(i).getProductName()+" for "+store.stock.stockItems.get(i).getProductPrice()+" ");
        }
        System.out.print("\nReceipt no: ");
        System.out.println(store.cashRegisters.get(0).currentReceipt+1);
        while(menu)
        {
            System.out.println("Name of the product");
            String name = scanner.nextLine();
            System.out.println("How many of them?");
            int quant = scanner.nextInt();
            if(store.sellers.get(0).checkProductStock(store.stock, name,quant)== -1)
            {
                System.out.println("We don't have that product anymore in stock");
                break;
            }
           store.cashRegisters.get(0).registerNewProduct(name,quant,store.stock);
            
            
            scanner = new Scanner(System.in);

            System.out.println("Anything else?   yes/no");
            String choice = scanner.nextLine();
            switch(choice)
            {
                case "yes":
                        {

                            break;
                        }
                case "no":
                {
                    menu = false;
                    break;
                }
            }
        } 
        System.out.println(store.sellers.get(0).Sell(store.cashRegisters.get(0), store.stock,products));
        System.out.println("Transaction finished");
        
    }
    
}
