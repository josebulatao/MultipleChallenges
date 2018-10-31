package com.com.PlaylistChallenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Song song=new Song("song1",3.34);
        Album album=new Album("tagalog");
        album.addSong("Makita kang muli",3.34);
        album.addSong("Blu sky",2.3);
        album.addSong("We are young",2.3);
        album.addSong("Numb",2.3);
        album.addSong("Lightnigh",3.1);
        album.addSong("Thunder",2.3);
        album.addSong("Blue jeans",2.3);
        /*System.out.println("album title:"+album.getGenre());
        for(int ctr=0;ctr<album.getSongs().size();ctr++){
            System.out.println(album.getSongs().get(ctr).getTitle()+" duration : "+album.getSongs().get(ctr).getDuration());
        }*/
        LinkedList<String> songs=selectSong(album);

    }
    public static void getAlbumSongs(Album album){
        System.out.print("Select songs to add on the playlist\n");
        for(int ctr=1;ctr<=album.getSongs().size();ctr++){
            System.out.print("["+ctr+"] "+album.getSongs().get(ctr-1).getTitle()+"\n");
        }
        System.out.print("["+(album.getSongs().size()+1)+"] Exit\n ");
        System.out.print("Choice: ");
    }
    public static LinkedList<String> selectSong(Album album){
        LinkedList<String> linkedList=new LinkedList<String>();
        boolean quit=false;
        Scanner scanner=new Scanner(System.in);
        while (quit==false){
            getAlbumSongs(album);
            int selector = scanner.nextInt();
            selector--;
            if(selector==album.getSongs().size()){
                ListIterator<String> stringListIterator=linkedList.listIterator();
                System.out.println("Songs on the playlist: ");
                while (stringListIterator.hasNext()){
                    System.out.println(stringListIterator.next());
                }
                quit=true;
            }
            else if(linkedList.isEmpty()){
                linkedList.add(album.getSongs().get(selector).getTitle());
            }
            else if(testList(album.getSongs().get(selector).getTitle(),linkedList)){
                for(int ctr=0;ctr<album.getSongs().size();ctr++){
                   if(album.getSongs().get(ctr).getTitle().equals(album.getSongs().get(selector).getTitle())){
                           linkedList.add(album.getSongs().get(selector).getTitle());
                   }
                }
            }

        }
        return linkedList;
    }
    public static boolean testList(String selector,LinkedList<String> linkedList){
        ListIterator<String> tester=linkedList.listIterator();
        while (tester.hasNext()){
            if(tester.next().equals(selector)){
                System.out.println("Song is already on the playlist");
                return false;
            }
        }
        return true;
    }
}
