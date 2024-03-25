/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mergesort;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class MyArrayList<E> extends ArrayList<E>{
    public void mergeSort(int start, int end){
        int mid;
        if(start < end){
            mid = (start+end)/2; //get the mid point from the current start and end
            mergeSort(start, mid); //first part of array sorted by recursive call
            mergeSort(mid+1, end); //2nd part of array sorted by reclusive call
            merge(start, mid, end); //merges the array s1 (start to mid) with s2 (mid to end)
        }
    }
        
        public void merge(int left, int middle, int right){
            int i = left;
            int j = middle+1;
            int k = 0;
            
            ArrayList<E> tempArray = new ArrayList<>();
            
            //
            while(i <= middle && j <= right){//items in 1st half to be copied
                if( ((Comparable)get(i)).compareTo((Comparable)get(j)) < 0 ){ //compare and < 0 smaller than
                    tempArray.add(k, get(i));
                    i++;
                }else{
                    tempArray.add(k, get(j));
                    j++;
                }
                k++;
            }
            
            while(i <= middle){
                tempArray.add(k, get(i));
                k++;
                i++;
            }
            while(j <= right){
                tempArray.add(k, get(j));
                k++;
                j++;
            }
            for(i=left, k=0; i <= right; i++, k++){
            set(i, (E)tempArray.get(k));
        }
            
        }
       
        }
        
        
    


