/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinkedlist;

/**
 *
 * @author Alex
 */
public class DLList implements LinearListInterface{
    
     private Node head;
    private Node last;
    private Node curr;
    private int size; //manually manage the list size

    DLList(){ //empty list created
        head = null; 
        last = null; 
        size = 0;
        curr = head;
    }
    @Override
    public boolean isEmpty(){
	 return (size == 0);
    }
    @Override
    public int size(){
	 return size;
    }
    
    private void setCurrent(int index){
        //1 start at the head as we can't randomly access in a DLL, as it is not sequential/contigous in memory
        //2 loop along till you meet that index, 
        //3 set the one at the index to be current
	curr = head; //start at the head 
	for (int i  = 1; i < index; i++){ 
		curr = curr.getNext();
        }
    }
    
    @Override
    public void add(int index, Object theElement) {
        //add here the code that implements operation
        //that adds a new node on a given position (index)
        
        //insert a new Node when the lisy is empty
        if (size == 0){        
            // write your code here theElement, prev, next
            Node newNode = new Node(theElement, null, null);
            head = newNode;
            last = newNode;
                
        } else {
            // Insert a new Node at the head position
            if (index == 1){
                Node newNode = new Node(theElement, null, null);
                //set up the links
                newNode.setNext(head);
                head.setPrev(newNode);
                //add the newNode in the head position
                head = newNode;
                             
            } else if (index == (size+1)){  
                // Insert a new Node at the last position
                Node newNode = new Node(theElement, null, null);
                newNode.setPrev(last); //set up link to prev
                last.setNext(newNode); //set up link to the new node
                last = newNode; //add the newNode to the last reference
                
            }else {
                // Insert a new node in the middle
                setCurrent(index); //use method to move the curr ref to that position
                Node newNode = new Node(theElement, null, null);
                //set up the ref links
                newNode.setNext(curr); 
                Node prev = curr.getPrev(); //set the prev ref
                newNode.setPrev(prev); //link to it
                prev.setNext(newNode);//add our new node
                curr.setPrev(newNode); //add our new node
                
                
            }
          }
          size++;

    }

    //@Override
   // public void remove(int index);
       

    @Override
    public Object get(int index) {
        setCurrent(index);
        return curr;
    }
    
    
    
    //************************************************************/
    // Provide a printlist() method which will print out       */
    // the contents of the double linked list, starting with he first node                                */
    //************************************************************/
    @Override
    public void printList() {
        //for(int i = 0; i < list.size() ; i++) 
        //for(start at head; go along as there is not a pointer to null; increment from this note to the next)
         for (Node aNode = head; aNode != null; aNode = aNode.getNext()) {
            System.out.println(aNode.getElement());
         }
         
         
    }

    @Override
    public void remove(int index) {
       if (index < 1 || index > size) {
        throw new IndexOutOfBoundsException("Index out of bounds");
    }
    
    // Removing the first node
    if (index == 1) {
        if (size == 1) {
            // Only one node in the list
            head = null;
            last = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
        }
    } else if (index == size) {
        // Removing the last node
        last = last.getPrev();
        last.setNext(null);
    } else {
        // Removing a node in the middle
        setCurrent(index);
        Node prevNode = curr.getPrev();
        Node nextNode = curr.getNext();
        prevNode.setNext(nextNode);
        nextNode.setPrev(prevNode);
    }
    
    size--;
    }
    
    
}
