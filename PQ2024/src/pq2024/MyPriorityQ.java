/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pq2024;

import java.util.ArrayList;

/**
 *
 * @author EThornbury
 */
public class MyPriorityQ implements PQInterface{
    private ArrayList<PQElement> thePQueue;
    
    public MyPriorityQ() {
        thePQueue = new ArrayList<>();    
    } 
    
    @Override
    public boolean isEmpty() { 
        return thePQueue.isEmpty(); 
    }
    
    @Override
    public int size(){
        return thePQueue.size();
    }
    
    private int findInsertPosition(int newkey){  
        PQElement elem;
        int position = 0; //declare here as this is what we will send back
        
	//loop over the PQ and check the key of each elem by utilising a temp 
        System.out.println("inside findInsertKey loop. newkey = " +newkey);
        for (position = 0; position < thePQueue.size(); position++) {
            System.out.println("inside findInsertKey loop. position = " +position);
            elem = thePQueue.get(position);
            if(elem.getPriority()< newkey){  //compare the priority's
                break; //if less then quit as you have it, gets returned below
            }
        }
              
              
//        boolean found = false; //set to false
//        while (position < thePQueue.size() && !found){
//            elem = thePQueue.get(position);  //get the key from the PQElement obj 
//            if(elem.getPriority() > newkey)  
//                position = position +1;
//            else{
//                found = true;
//            }
//         }

         return position;
    }
    
    // new element with a given key and object info will be added 
    @Override
    public void enqueue(int priorityKey, Object item){
        int index;
        PQElement elem = new PQElement(priorityKey, item);
        
        index = findInsertPosition(priorityKey);

        if (index > size())
            thePQueue.add(elem);
        else
            thePQueue.add(index, elem);
    }

    //the first element has the highest priority
    @Override
    public Object dequeue(){
       return thePQueue.remove(0);
    }
    
    @Override
    public String printPQueue(){
        PQElement temp;
        String txt = new String();
        for (int i = 0; i<thePQueue.size(); i++){
            temp = thePQueue.get(i);
            txt = txt.concat("Key = "+temp.getPriority()+" Element= "+temp.getElement()+ "\n");
            
        }
         return txt;
    }
	
    //another option
    public void displayQ(){
        PQElement temp;
        for(int i = 0; i < thePQueue.size(); i++){
            temp = thePQueue.get(i);
            System.out.println(temp.toString());
            //System.out.println("Key = " +temp.getPriority()+ " Element info: " +temp.getElement());
        }
    }

}
