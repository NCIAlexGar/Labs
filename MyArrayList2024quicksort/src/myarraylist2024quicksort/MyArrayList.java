/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myarraylist2024quicksort;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class MyArrayList<E> extends ArrayList<E>{
    
    
    public void quickSort(int start, int end){
    int pivotIndex;
    if(start < end ){
    pivotIndex = partition(start, end);
    //select the pivot and re-arrange elements in 2 partitionsso that start < pivot '&' pivot+1> end
    quickSort(start, pivotIndex-1);
    quickSort(pivotIndex+1,end);
    }
}
    
    public int partition(int start, int end){
        int up = start+1;
        int down = end;
        E pivot = get(start);
        //as long as UP and Down indexes dont pass each other
        while(up > down){
            while(up < end && ((Comparable)get(up)).compareTo((Comparable)pivot) < 0){
                up++;
            }
            while(down > start && (((Comparable)get(down)).compareTo((Comparable)pivot) > 0 || ((Comparable)get(down)).compareTo((Comparable)pivot) == 0)){
                //decrementing DOWN index till we find the 1st element < pivotor == to pivot
                down--;
            }
            if(up < down){
                E elemUp = get(up);
                set(up, get(down)); //swap the elements found - set(index, Obj)
                set(down, elemUp);
            }
        }
        //Up and DOWN indexes have passed each other so swap pivot
        set(start, get(down));
        set(down, pivot);
        
        //return index
        return down; //new pivotIndex for quicksort() above
    }
    
}
