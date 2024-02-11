/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package labstack;

/**
 *
 * @author Alex
 */
public interface StackInterface {
     public void push(Object newItem);
     
     
     
     public boolean isEmpty();
     
     public Object pop();
     public String peek();
     public String displayStack();
     String size();
     void emptyStack();
}
