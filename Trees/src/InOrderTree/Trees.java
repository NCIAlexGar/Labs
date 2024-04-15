/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package InOrderTree;

import preOrder.preOrderTree;



/**
 *
 * @author Alex
 */
public class Trees {
    Node root;
    
    public void addNode(int key, String name){
        Node newNode = new Node(key,name);
        if(root == null){
            root = newNode;
        }
        else{
            Node focusNode=root;
            Node parent;
            while(true){
                parent=focusNode;
                if(key < focusNode.key){
                    focusNode= focusNode.leftChild;
                    if(focusNode ==null){
                        parent.leftChild = newNode;
                        return;
                    }
                }else{
                    focusNode = focusNode.rightChild;
                    if(focusNode==null){
                        parent.rightChild= newNode;
                        return;
                    }
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    
    public void inOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            //print here for preorder
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode); //here for inorder
            inOrderTraverseTree(focusNode.rightChild);
            //print here for post
        }
    }
        
     
    
    public static void main(String[] args) {
        // TODO code application logic here
        Trees theTree = new Trees();
        theTree.addNode(50, "God");
        theTree.addNode(25, "President");
        theTree.addNode(15, "Vice President");
        theTree.addNode(30, "Foriegn Minister");
        theTree.addNode(75, "peasants");
        theTree.addNode(85, "animals");
        
        theTree.inOrderTraverseTree(theTree.root);




    }
        
        class Node{
            int key;
            String name;
            
            Node leftChild;
            Node rightChild;
            
            Node(int key, String name){
                this.key=key;
                this.name=name;
            }
            
            public String toString(){
                return name + "Has a key" + key;
            }
            
        }
    
     public void preOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            //add on top
            System.out.println(focusNode);
            preOrderTraverseTree(focusNode.leftChild);
            preOrderTraverseTree(focusNode.rightChild);
            
        }
     }
}
