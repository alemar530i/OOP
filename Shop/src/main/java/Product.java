

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Product {
    
    protected String productName;
    protected double price;
    protected int quantity;
    protected int ID=0;
    
    public Product(){};
    public Product(String name, double price, int quantity)
    {
        this.ID++;
        this.price = price;
        this.productName= name;
        this.quantity = quantity;
    }
}
