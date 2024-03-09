/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublelinkedlist;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class DoubleLinkedListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DLList myList = new DLList();
        
        // Add some elements to the list
        myList.add(1, "Apple");
        myList.add(2, "Banana");
        myList.add(3, "Orange");
        myList.add(4, "Pineapple ");
        myList.add(5, "Avocado");
        myList.add(6, "Tomato");

        JOptionPane.showMessageDialog(null, "list");
         // Print the size of the dllist
        JOptionPane.showMessageDialog(null, "Size of the list: " + myList.size());
        System.out.println("Size of the list: " + myList.size());

        // Print the list
        JOptionPane.showMessageDialog(null,"Original list:");
        myList.printList();
        
        
        // Remove the 3rd name
        myList.remove(3);
        System.out.println("\nList after removing the 3rd name:");
        myList.printList();

        // Remove the 1st name
        myList.remove(1);
        System.out.println("\nList after removing the 1st name:");
        myList.printList();
    }
    
}
