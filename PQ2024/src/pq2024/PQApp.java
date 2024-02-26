/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pq2024;

/**
 *
 * @author EThornbury
 */
public class PQApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        MyPriorityQ pq = new MyPriorityQ();
        pq.enqueue(7,"Have breakfast");
        pq.enqueue(10,"Go to College");
        pq.enqueue(2,"Call a friend");
        pq.enqueue(5,"Work on DSA Assignment");
        System.out.println("Size of PQ is " + pq.size());
        System.out.println("Is the PQ empty ? " + pq.isEmpty());

        System.out.println("Printing all my activities.. ");
        System.out.println(pq.printPQueue());
        
        PQElement elem = (PQElement)pq.dequeue();
        System.out.println("This activity was removed: "+elem.getElement());
        System.out.println("Printing after I have removed one activity... ");
        System.out.println(pq.printPQueue());
        
        //System.out.println("other displayQ");
        //pq.displayQ();
    }
    
}
