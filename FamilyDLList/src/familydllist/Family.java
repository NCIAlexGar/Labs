/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package familydllist;

/**
 *
 * @author Alex
 */
public class Family implements FamilyInterface{
    private Members head;
    private Members tail;
    private int size;

    public Family() {
        head = null;
        tail = null;
        size = 0;
    }
    
    @Override
    public boolean isEmpty(){
        
        return size == 0;
        
    }
    
    @Override
    public void add(String name, String role, int age){
         Members newMember = new Members(name, role, age);
        if (isEmpty()) {
            head = newMember;
            tail = newMember;
        } else {
            newMember.setPrev(tail);
            tail.setNext(newMember);
            tail = newMember;
        }
        size++;
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public void print(){
        Members current = head;
        System.out.println("Family Members:");
        while (current != null) {
            System.out.println("Name: " + current.getName() + ", Role: " + current.getRole() + ", Age: " + current.getAge());
            current = current.getNext();
        }
    }
    
    public void removeMember(String name) {
        Members current = head;
        while (current != null) {
            if (current.getName().equals(name)) {
                Members prevMember = current.getPrev();
                Members nextMember = current.getNext();

                if (prevMember != null) {
                    prevMember.setNext(nextMember);
                } else {
                    head = nextMember;
                }

                if (nextMember != null) {
                    nextMember.setPrev(prevMember);
                } else {
                    tail = prevMember;
                }

                size--;
                System.out.println(name + " has been removed from the family.");
                return;
            }
            current = current.getNext();
        }
        System.out.println("Member with name " + name + " not found in the family.");
    }
    
}
    
    

