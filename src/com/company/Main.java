package com.company;

import java.util.Scanner;

public class Main {

    private static Bank bank=new Bank("Bank of the Philippine Island");

    public static void main(String[] args) {
	// write your code here
        /*Branch branch=new Branch("Manila");
        branch.addNewCustomerOrTransaction("Jose",4032.1);
        branch.addNewCustomerOrTransaction("Jose",4223);
        branch.addNewCustomerOrTransaction("Jose",423112);
        branch.addNewCustomerOrTransaction("Gwapo",3241);
        branch.addNewCustomerOrTransaction("Darren",4231);
        branch.addNewCustomerOrTransaction("Darren",3231);
        branch.addNewCustomerOrTransaction("Darren",1231);
        branch.addNewCustomerOrTransaction("Darren",4231);

        branch.fetchData();*/
        /*bank.addBranch("Manila");
        bank.addCustomer("Manila","Jose",1234);
        bank.addCustomer("Manila","Jose",2321);
        bank.addCustomer("Manila","Jose",5231);
        bank.addBranch("Pasig");
        bank.addCustomer("Pasig","Darren",4213);
        bank.addCustomer("Pasig","Darren",42132);
        bank.addCustomer("Pasig","Darren",12324);
        bank.fetchData("Pasig");*/
        menu();


    }
    public static void menu(){
        Scanner scanner=new Scanner(System.in);
        choices();
        int choice=scanner.nextInt();
        scanner.nextLine();
        switch (choice){
            case 1:
                System.out.print("Enter Branch name: ");
                String branchName=scanner.nextLine();
                bank.addBranch(branchName);
                menu();
                break;
            case 2:
                System.out.println("Select Branch:");
                for(int ctr=0;ctr<bank.getBranches().size();ctr++){
                    System.out.println("["+(ctr+1)+"] "+bank.getBranches().get(ctr).getName());
                }
                System.out.println("Choice: ");
                int temp=scanner.nextInt();
                String bName=bank.getBranches().get(temp-1).getName();
                registerACustomer(bName);
                bank.fetchData(bName);
                menu();
                break;
            case 3:
                break;
            case 4:
                System.out.println("Select Branch:");
                for(int ctr=0;ctr<bank.getBranches().size();ctr++){
                    System.out.println("["+(ctr+1)+"] "+bank.getBranches().get(ctr).getName());
                }
                System.out.println("Choice: ");
                temp = scanner.nextInt();
                bName=bank.getBranches().get(temp-1).getName();
                bank.fetchData(bName);
                menu();
                break;
            case 5:
                break;
        }
    }
    public static void registerACustomer(String branch){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Customer name: ");
        String name=scanner.nextLine();
        System.out.print("\nEnter amount to deposit: ");
        double amount=scanner.nextDouble();
        bank.addCustomer(branch,name,amount);

    }
    public static void choices(){
        System.out.println("Welcome to "+ bank.getName()+".\n" +
                "Please select your desired transaction:\n" +
                "[1] Add a Branch\n" +
                "[2] Add a Customer\n" +
                "[3] Add Transaction for a Customer\n" +
                "[4] View Branch details\n"+
                "[5] Exit\n" +
                "Choice: ");
    }
}
