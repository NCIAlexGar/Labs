/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labstack;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alex
 */
public class MyStack implements StackInterface{
  private ArrayList<String>aStack;
  
  public MyStack(){
           aStack = new ArrayList<>();
   }
   
  @Override
   public void push(Object newItem){
       aStack.add(0, (String)newItem);
   }
   
  @Override
   public boolean isEmpty(){
       return aStack.isEmpty();
   }
   
  @Override
   public Object pop(){
       if(aStack.isEmpty()){
           return null;
       }else{
       return aStack.remove(0);
   }
   }
   
  @Override
   public String peek(){
       if(isEmpty()){
           System.out.println("Stack is empty");
           return null;
       }else{
           return aStack.get(0);
       }
       
   }
   
   
  @Override
   public String displayStack(){
       
       String str = "";
       if(isEmpty()){
           str = str.concat("Empty stack, nothing to display");
       }else{
         
           Iterator it;
           it = aStack.iterator();
           while(it.hasNext()){
               str = str.concat((String)it.next());
               str = str.concat(";");
           }
       }
       //return the str 
       return str; 
   }
  
  
  
  @Override
    public String size() {
        
        return null;
        
    }

  @Override
    public void emptyStack() {
       
    }
    
     private class Node {
        String data;
        Node next;
        
        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
}
