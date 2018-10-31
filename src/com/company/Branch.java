package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }
    protected void something(){

    }
    public boolean addNewCustomerOrTransaction(String name,double amount){
        boolean customer=checkCustomer(name);
        if(customer!=false){
            for (Customer e:customers) {
                if(e.getName().equals(name)){
                    e.addTransaction(amount);
                }
            }
        }
        else if(!(customer!=false)){
            this.customers.add(new Customer(name,amount));
        }

        return false;
    }
    public void fetchData(){

        for (Customer i:customers) {
            System.out.println(i.getName()+" : ");
            i.printTransaction();
            System.out.println();
        }
    }
    public boolean checkCustomer(String customerName){
        for (Customer i:customers) {
            if(i.getName().equals(customerName)){
            return true;
            }
        }
        return false;
    }
    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    @Override
    public String toString() {
        return String.valueOf(customers);
    }
}
