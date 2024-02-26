/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pqhospital;

/**
 *
 * @author Alex
 */
public interface HospitalInterface {
    
    public void enqueue(int priorityKey, Object item);
    public int size();
    public boolean isEmpty();
    public Object dequeue();
    public void printPQueue();
    
    
}
