


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class CashRegister extends Bill{
     
    public void Payment(Bill bill)
    {
        bill.billID++;
       double price = bill.GivePrice();
       System.out.print("BillId: ");
       System.out.println(bill.billID);
       System.out.println(price);
       System.out.println("Payment done");
    }
     
}
