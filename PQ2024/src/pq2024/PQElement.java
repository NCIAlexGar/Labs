/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pq2024;

/**
 *
 * @author EThornbury
 */
public class PQElement {
   
    //Each element has the object information and the key/priority assigned to that object

    private int priority;
    private Object element;

    public PQElement(int priority, Object element) {
        this.priority = priority;
        this.element = element;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "PQElement{ " + ", priority= " + priority + ", element= " + element + '}';
    }
    
    

}
