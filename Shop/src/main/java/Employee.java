
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
public class Employee extends CashRegister {

    private boolean employeeType;
    private String name;
    public int password;

    Employee(boolean admin) {
        this.employeeType = admin;
    }
    CashRegister register = new CashRegister();

    public void AcceptPayment(Bill bill) {
        register.Payment(bill);
    }

    public void ModifyStock(Stocks stock) {
        
        boolean app = true;
         while (app) 
        {
            System.out.println("Name of the item you want to modify, 'exit' to leave");
            stock.productList.forEach((productToModify)
                    -> {
                System.out.println(productToModify.productName);
            });
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            
            if(name.equals("exit") )
                return;
            int i=0;
            while(i < stock.productList.size())
            {
               
                if (stock.productList.get(i).productName.equals(name)) {
                    System.out.println("1. Price  2. Quantity  0. Exit");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1: {
                            System.out.println("New price:");
                            int newPrice = scanner.nextInt();
                            stock.productList.get(i).price = newPrice;
                            break;
                        }

                        case 2: {
                            System.out.println("New quantity:");
                            int newQuantity = scanner.nextInt();
                            stock.productList.get(i).quantity = newQuantity;
                            break;
                        }

                        case 0: {
                            app = false;  
                            break;
                        }
                    }
                } 
                i++;
            }
        }      
    }
}

