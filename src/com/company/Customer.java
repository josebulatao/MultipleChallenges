package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    public Customer(String name,double initial) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initial);
    }
    public Customer(double initial) {
        this.transactions = new ArrayList<Double>();
        addTransaction(initial);
    }
    public void printTransaction(){
        for (Double e:transactions) {
            System.out.print(e);
        }
    }
    public Customer(String name) {
        this.name=name;
    }

    public void addTransaction(double mon){
        this.transactions.add(mon);
    }
    public String getName() {
        return this.name;
    }
    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
