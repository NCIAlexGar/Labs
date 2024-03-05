/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbubble;

/**
 *
 * @author Alex
 */
import java.util.ArrayList;
public class MyArraylist<ElemType> extends ArrayList<ElemType> {
    
    public void betterBubble(){
        Comparable elemAtJ; 
    Comparable elemAtJplus;
    for(int i = 0; i < size(); i++){
        for(int j = 0; j < size()-1-i; j++){
            elemAtJ = (Comparable)get(j); 
            elemAtJplus= (Comparable)get(j+1); 
            if(elemAtJ.compareTo(elemAtJplus) >0){
                // Swap elements
                ElemType temp = get(j);
                set(j, get(j+1));
                set(j+1, temp);
            }
        }
    }  
}
    
    private void swap(int position1, int position2){
        //temp holders for elements
        //remove and add your elements to the correct positions
        ElemType tempObj1 = get(position1);
        ElemType tempObj2 = get(position2);
        
        remove(position1);
        remove(position2);
        
        add(position1, tempObj2);
        add(position2, tempObj1);
    }
    
    
}
