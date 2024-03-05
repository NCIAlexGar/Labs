/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linearlistlab2;

/**
 *
 * @author Alex
 */
public class LinearListLabApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heress
        
         // Instantiate the SSLists object
        SLLinear myList = new SLLinear();
        
        // Add some elements to the list
        myList.add(1, "Patient: Joe");
        myList.add(2, "Patient James");
        myList.add(3, "Patient Pablo");
        
        // Print the list
        System.out.println("Initial List:");
        myList.print();
        
    }
    
}
