package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit=new LinkedList<String>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");
        travelBuddies(placesToVisit);

    }
    private static void printList(LinkedList<String> linkedList){
        ListIterator<String> i =linkedList.listIterator();
        System.out.println("Places to visit:\n");
        while (i.hasNext()){
               System.out.println(i.next());
            }
        System.out.println("=========================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> stringListIterator=linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int camparison=stringListIterator.next().compareTo(newCity);
            if(camparison==0){
                System.out.println(newCity+" is already on the list");
                return false;
            }
            else if(camparison>0){
                //newCity shoud add before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(camparison<0){
                //move to the next city
            }
        }
        stringListIterator.add(newCity);
        return false;
    }
    public static void menu(){
        System.out.println("What do you want to do?\n" +
                "[1]View all places to visit\n" +
                "[2]Move to the next site of Road Show\n" +
                "[3]Move back to the previous site of the Road Show\n" +
                "[4]View menu\n" +
                "[5]Exit\nChoice: ");
    }
    private static void travelBuddies(LinkedList travel){
        ListIterator<String> place=travel.listIterator();
        boolean exit=false;
        boolean googleForward=true;
        menu();
        Scanner scanner=new Scanner(System.in);
        while (exit!=true){
        int ch=scanner.nextInt();
            switch (ch){
              case 1:
                    printList(travel);
                    break;
                case 2:
                    if(!googleForward){
                        if(place.hasNext()){
                            place.next();
                        }
                        googleForward=true;
                    }
                    if(place.hasNext()){
                        System.out.println("You are now visiting "+place.next());
                    }
                    else{
                        System.out.println("You are now on the final site of the road show");
                    }
                    break;
                case 3:
                    if(googleForward){
                        if(place.hasPrevious()){
                            place.previous();
                        }
                        googleForward=false;
                    }
                    if(place.hasPrevious()){
                        System.out.println("You are now visiting "+place.previous());
                    }
                    else{
                        System.out.println("You are now on the first site of the road show");
                    }
                    break;
                case 4:menu();
                    break;
                case 5:
                    exit=true;
                    break;
            }
        }
    }

}
