package com.codingdojo.dll;
public class DLL {
    public Node head;
    public Node tail;
    
    public DLL() {
        this.head = null;
        this.tail = null;
    }
    
    // the push method will add a new node to the end of the list
    public void push(Node newNode) {
        // if there is no head in the list, aka, an empty list, we set the newNode to be the head and tail of the list
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        
        // first find the lastNode in the list
        // then, set the lastNode's next to be the newNode;
        // then, we have to set the previous of the lastNode to the lastNode that we found previously.
        // finally, set the list's tail to be the node that we have added
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }
    

    
     public void printValuesForward() {
    	 System.out.println("------Print Values Forward -----");

        // find the first node, aka head.
        Node current = this.head;
        
        // while the current node exists...
        while(current != null) {
            // print it's value
            System.out.println(current.value);
            // and move on to it's next node.
            current = current.next;
        }
    }
    
        	//method prints the values of the nodes from the tail to the head.
    	public void printValuesBackward() {
    	System.out.println("------Print Values Backward -----");
		Node current  = this.tail; //last node 
		while (current != null) {
			System.out.println(current.value);
			current = current.previous; // next node
		}
    	
    }
    	
    	
    	//Node pop(): This method removes the last node of our DLL and returns it.
    	Node pop() {
    		Node remove = this.tail;
    		this.tail = remove.previous;
    		this.tail.next = null;
    		return remove;
    	}
    	
    	//boolean contains(Integer value): This method returns a boolean whether the value in the argument 
    	//is in the list or not. Return true if the value exists, else, return false.
    	public boolean contains(Integer value) {
    		Node current = this.head; 
    		
    		while (current != null && current.value != value) { 
    			current = current.next;
    		}
    		if (current == null) {
    			return false;
    		} else {
    			return true;
    		}
    	}
    	
    	
    	//int size(): Returns the number of nodes in the list.
    	public int size() {
    		int count = 0;
    		
    	
    		Node current = this.head;
    		if (current == null) {
    			return 0;
    		}
    		while (current != null) {
    			current = current.next;
    			count++;
    		}
    		return count;
    	}
    	
   
}