/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package familydllist;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class FamilyDLListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Family myList = new Family();
        
        myList.add("Johnaten", "Grand Father", 71);
        myList.add("Victoria", "Grand Mother", 79);
        myList.add("John", "Father", 44);
        myList.add("Mary", "Mother", 45);
        myList.add("Johnny", "Son", 19);
        myList.add("Dog", "Daughter ", 18);
        
        System.out.println("Size of family: " + myList.size());
        myList.print();
        
        Family family = new Family();
        
        
        
        
        
      
        //Joptionpane
        while (true) {
            String input = JOptionPane.showInputDialog(
                "Choose an option:\n" +
                "1. Add a new family member\n" +
                "2. Remove a family member\n" +
                "3. View family members\n" +
                "4. Exit"
            );

            if (input == null) { // If cancel is pressed
                break;
            }

            int choice = Integer.parseInt(input);
            
            if (choice == 1) {
                String name = JOptionPane.showInputDialog("Enter name:");
                String role = JOptionPane.showInputDialog("Enter role:");
                int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
                family.add(name, role, age);
            } else if (choice == 2) {
                String memberToRemove = JOptionPane.showInputDialog("Enter name of family member to remove:");
                family.removeMember(memberToRemove);
            } else if (choice == 3) {
                family.print();
            } else if (choice == 4) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
        
        
    }
    

