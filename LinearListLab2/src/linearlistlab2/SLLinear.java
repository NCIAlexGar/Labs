/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linearlistlab2;

/**
 *
 * @author Alex
 */
public class SLLinear implements NewInterface{
    //Represents the first node in the linked list.
    private Node head;
    //Represents the current node being processed.
    private Node curr;
    // Represents the previous node to curr.
    private Node prev;
    //size: Represents the size of the linked list.
    private int size;
    
    
    //Initializes the head to null and size to 0.
    //Sets curr and prev to head.
    public SLLinear(){
        head = null; size = 0;
        curr = head; prev = null;
    }
    
    //Checks if the linked list is empty by verifying if size is 0.
    @Override
    public boolean isEmpty(){
        
       if (size == 0)
		return true;
	 else
		return false;
        
    }
    
    //Returns the size of the linked list.
    @Override
	public int size(){
            
        return size;
            
        }
        
        //Removes an element at a specified index from the linked list. Special case handling for removing the head of the list.
        //Finds the previous and current node using setCurrent() method and adjusts the links accordingly.
    @Override
        public void remove(int index){
            // special case of removing at the head of the list
	if (index == 1){
		head = head.getNext();
	}else{
      // find the previous and current node
		setCurrent(index);
	     prev.setNext(curr.getNext());
	}
    size=size-1;
        }

        
    @Override
        public void add(int index, Object theData){
            // special case of adding at the head of the list
    if (index == 1) {
        Node newNode = new Node(theData, head);
        head = newNode;
    } else {
        setCurrent(index);
        Node newNode = new Node(theData, curr);
        prev.setNext(newNode);
    }
    size++;
            
        }
        
    @Override
        public void print(){
               Node aNode = head;
  while ( aNode != null ) {
	System.out.println(aNode.getData().toString());       
  	aNode = aNode.getNext();
        }
        }
    
           private void setCurrent(int index) {
      int i;
	prev = null;
	curr = head; 
	for (i  = 1; i < index; i++){  
		prev = curr;
		curr = curr.getNext();
 }
    
}
}
