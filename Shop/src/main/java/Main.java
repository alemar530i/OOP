
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //creeaza un nou bill
        
        int choice;
        int pass;
        Stocks stock = new Stocks(); // se creeaza produsele din stoc
        stock.AddProduct(new Product("Banane",1.20,100));
        stock.AddProduct(new Product("Cartofi",4,100));
        stock.AddProduct(new Product("Dezinfectant",15,100));
        stock.AddProduct(new Product("Ulei",5,100));
        Employee seller = new Employee(false);
        Employee admin = new Employee(true);
        admin.password = 2109;
        System.out.println("Password for admin is  2109  so you don't have to search for it in the code");
        boolean app=true;
        while(app)
        {
        System.out.println("1. Admin *********** 2. Seller *********** 0. Exit");
        choice = scanner.nextInt();
        switch(choice)
        {
            
            case 1:
            {
                System.out.println("Password:");
                pass = scanner.nextInt();
                if(pass == admin.password)
                    admin.ModifyStock(stock);
                else System.out.println("Wrong password");
                break;
            }
            case 2:
            {
                System.out.println("You have a customer!");
                Bill bill = new Bill();
        bill.ItemsToBuy(stock); // se aleg produsele de pe bill
                seller.AcceptPayment(bill);
                stock.UpdateAfterSell(bill);
                break;
            }
            
            case 0:
            {
                app=false;
                break ;
                
            }
        }
        
        }
        
    }
    
}
