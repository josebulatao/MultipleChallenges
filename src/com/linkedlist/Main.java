package com.linkedlist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Jose",94.2);
        Customer anotherCustomer;
        anotherCustomer=customer;
        anotherCustomer.setBalance(32.12);
        System.out.println("Balance for customer " + customer.getName()+" is " +customer.getBalance());
        ArrayList<Integer> intList=new ArrayList<Integer>();
        intList.add(4);
        intList.add(2);
        intList.add(5);
        intList.add(7);
        intList.add(8);
        for(int ctr=0;ctr<intList.size();ctr++){
            System.out.println(ctr+": " + intList.get(ctr));
        }
        intList.add(1,2);
        for(int ctr=0;ctr<intList.size();ctr++){
            System.out.println(ctr+": " + intList.get(ctr));
        }

    }

}
