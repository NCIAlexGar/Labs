/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package familydllist;

/**
 *
 * @author Alex
 */
public class Members {
    private String name, role;
    private int age;
    private Members prev;
    private Members next;

    public Members(String name, String role, int age) {
        this.name = name;
        this.role = role;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Members getPrev() {
        return prev;
    }

    public void setPrev(Members prev) {
        this.prev = prev;
    }

    public Members getNext() {
        return next;
    }

    public void setNext(Members next) {
        this.next = next;
    }
    
    
    
    
}
