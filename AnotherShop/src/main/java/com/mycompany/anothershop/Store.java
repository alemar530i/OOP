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
public class Store{
    String name;
    Stock stock = new Stock();
    List<CashRegister> cashRegisters = new ArrayList<>();
    List<Seller> sellers = new ArrayList<>();
    List<Admin> admins = new ArrayList<>();
    public Store(String _name)
    {
        this.name = _name;
    }
    public void addNewCashRegister(int No)
    {
        cashRegisters.add(new CashRegister());
    }
    public void addNewSeller(String _name)
    {
        sellers.add(new Seller(_name));
    }
    public void addNewAdmin(String _name)
    {
        
         admins.add(new Admin(_name));
    }
}
