/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mergesort;

/**
 *
 * @author Alex
 */
public class MergeSortApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyArrayList<Integer> mylist = new MyArrayList<>();
        mylist.add(12);
         mylist.add(89);
          mylist.add(6);
           mylist.add(86);
            mylist.add(12);
             mylist.add(1);
              mylist.add(99);
               mylist.add(8);
             
               System.out.println("Elements are" +mylist.toString());
               mylist.mergeSort(0, (mylist.size()-1));
               System.out.println("Sorted list" +mylist.toString());
    }
    
}
