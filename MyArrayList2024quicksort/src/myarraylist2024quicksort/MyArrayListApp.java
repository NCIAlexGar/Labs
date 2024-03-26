/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myarraylist2024quicksort;

/**
 *
 * @author Alex
 */
public class MyArrayListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyArrayList<Integer> mylist = new MyArrayList<>();
        mylist.add(99);
        mylist.add(6);
        mylist.add(87);
        mylist.add(15);
        mylist.add(58);
        mylist.add(34);
        mylist.add(87);
        mylist.add(0);
        mylist.add(56);
        mylist.add(5);
        
        System.out.println("Before:" + mylist.toString());
        mylist.quickSort(0, (mylist.size()-1));
        System.out.println("After:" + mylist.toString());
    }
    
}
