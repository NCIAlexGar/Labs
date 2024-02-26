/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pq2024;

/**
 *
 * @author EThornbury
 */
public interface PQInterface {
    public void enqueue(int priority, Object element);
    public int size();
    public boolean isEmpty();
    public Object dequeue();
    
    public String printPQueue();

}
