/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pqhospital;

import java.util.PriorityQueue;

/**
 *
 * @author Alex
 */
public class Hospital implements HospitalInterface{
    
    
    PriorityQueue<Patients> priorityQueue;

    public Hospital() {
        priorityQueue = new PriorityQueue<>();
    }

    @Override
    public void enqueue(int priorityKey, Object item) {
        if (item instanceof Patients) {
            Patients patient = (Patients) item;
            patient.setPriority(priorityKey);
            priorityQueue.offer(patient);
        } else {
            throw new IllegalArgumentException("Item must be an instance of Patient");
        }
    }

    @Override
    public int size() {
        return priorityQueue.size();
    }

    @Override
    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }

    @Override
    public Object dequeue() {
        return priorityQueue.poll();
    }

    @Override
    public void printPQueue() {
        for (Patients patient : priorityQueue) {
            System.out.println(patient);
        }
    }
    
 
    
}
