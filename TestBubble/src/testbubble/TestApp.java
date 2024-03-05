/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testbubble;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class TestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyArraylist<Integer> list1 = new MyArraylist<Integer>();
        
        //to add items unsorted to your list1, print list1 
        // Add items unsorted to list1
        list1.add(5);
        list1.add(2);
        list1.add(8);
        list1.add(1);
        list1.add(3);

        // Print list1
        JOptionPane.showMessageDialog(null, "Original list:");
        JOptionPane.showMessageDialog(null,list1);
        System.out.println("Original list:");
        System.out.println(list1);

        // Sort the list using betterBubble method
        list1.betterBubble();

        // Print sorted list1
        JOptionPane.showMessageDialog(null, "Sorted list:");
        JOptionPane.showMessageDialog(null,list1);
        System.out.println("Sorted list:");
        System.out.println(list1);
    }
    
}
