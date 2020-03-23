
import java.util.ArrayList;
import java.util.List;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Bill {
    public List<Product> productsToBuy = new ArrayList<Product>();
    protected double totalPrice;
    protected int billID=0;
    
    protected void ItemsToBuy(Stocks stock)
    {
        System.out.println("The shop has:");
        int i=0;
            while(i < stock.productList.size())
            {
                System.out.println(stock.productList.get(i).productName+" "+stock.productList.get(i).price+" lei");
                i++;
            }
            
        boolean moreProducts = true;
        while(moreProducts)
        {
        System.out.println("Type the name of the item you want to buy ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        i=0;
            while(i < stock.productList.size())
            {
               
                if (stock.productList.get(i).productName.equals(name)) 
                {
                    double price=stock.productList.get(i).price;
                    System.out.println("How many?");
                    int number = scanner.nextInt();
                    productsToBuy.add(new Product(name,price,number));
                } 
                i++;
            }
            System.out.println("Anything else? 1.Yes  2.No");
            int choice = scanner.nextInt();
            switch(choice)
            {
                case 1:
                {
                    
                    break;
                }
                case 2:
                {
                    moreProducts = false;
                    break;
                }
            }
        }
        
        
    }
    
    protected double GivePrice()
    {
        productsToBuy.forEach((product)->
        {
           totalPrice += product.price*product.quantity;         
        });
        double aux = totalPrice;
        this.totalPrice = 0;
        return aux;
        
    }
}   
