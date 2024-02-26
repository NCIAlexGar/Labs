/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pqhospital;

/**
 *
 * @author Alex
 */
public class Patients implements Comparable<Patients>{
    
    private String name;
    private String illness;
    private String injury;
    private int priority;

    public Patients(String name, String illness, String injury) {
        this.name = name;
        this.illness = illness;
        this.injury=injury;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Patients other) {
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Illness: " + illness + "Injury" + injury + ", Priority: " + priority;
    }
    
    
}
