package com.codingdojo.dll;
public class DLLTest {
    public static void main(String[] args) {
        DLL dll = new DLL();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(50);
        Node n4 = new Node(60);
        Node n5 = new Node(80);
        Node n6 = new Node(100);
        
        dll.push(n1);
        dll.push(n2);
        dll.push(n3);
        dll.push(n4);
        dll.push(n5);
        dll.push(n6);
        
        dll.printValuesForward();
        dll.printValuesBackward();
        
		
		System.out.printf("\n POP the Node: %s \n",dll.pop());
		dll.printValuesForward();
		
		System.out.printf("\n Loking for 20 inside Doubly Linked Lists ! %s \n", dll.contains(20));
		System.out.printf("\n Loking for 200 inside Doubly Linked Lists! %s \n", dll.contains(200));
	
		
		System.out.printf("\n Number of Nodes: %s \n", dll.size());

	
        
    }
}