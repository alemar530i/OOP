
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Stocks extends Product
{
    
    public List<Product> productList = new ArrayList<>();
    public void AddProduct(Product product)
    {
        productList.add(product);
    }
    
    public void UpdateAfterSell(Bill bill)
    {
        productList.forEach((productInStock)->
        {
           bill.productsToBuy.forEach((productToSell)->
        {
                if(productInStock.productName.equals(productToSell.productName))
                {
                    productInStock.quantity-=productToSell.quantity;
                }
        });     
        });
        
        productList.forEach((product)->
        {
            System.out.println(product.quantity +" "+ product.productName+ " " + "left in stock.");
        });
        
    }
    
}
