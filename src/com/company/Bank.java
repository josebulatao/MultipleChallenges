package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    public void addBranch(String name){
        if(checkBranches(name)){
            System.out.println("Branch already exist");
        }
        else{
            Branch branch=new Branch(name);
            this.branches.add(branch);
        }
    }
    private boolean checkBranches(String branchName){
        for (Branch x:branches) {
            if(x.getName().equals(branchName)){
                return true;
            }
        }
        return false;
    }
    public void addCustomer(String branchName,String name,double amount){
        for (Branch i:branches) {
            if(i.getName().equals(branchName)){
                i.addNewCustomerOrTransaction(name,amount);
            }
        }

    }
    public void fetchData(String where){
        for (Branch b:branches) {
            if(b.getName().equals(where)){
                System.out.println("Branch: "+b.getName());
                    for(int ctr=0;ctr<b.getCustomers().size();ctr++){
                        System.out.print("Customer name: "+b.getCustomers().get(ctr).getName()+"\nTransactions: \n");
                        System.out.println(b.getCustomers().get(ctr).getTransactions());
                    }
            }

        }

    }
    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}
