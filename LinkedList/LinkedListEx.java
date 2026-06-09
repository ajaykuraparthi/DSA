package LinkedList;

public package com.oops;

import java.util.*;

class Node{
	
    String data;
    Node next;
    
    Node(String data){
        this.data = data;
     //   this.next = next;
    }
}

 
public class LinkedListEx {
	static Node head;
	
	public static void printLinkedList(){
         Node temp = head;
      while(temp != null){
          System.out.print(temp.data);
          temp = temp.next;
          if(temp!=null){
            System.out.print(" --> ");
          }
      }
      
    }
    
    public static int LLlength(){
        int cnt = 0;
       
        while(head != null){
            cnt++;
            head = head.next;
        }
        return cnt;
    }
    
    public static int search(String elm) {
    	int idx = 0;
    	
    	while(head != null) {
    		if(head.data.equals(elm)) {
    			return idx;
    		}
    		head = head.next;
    		}
    	return -1;
    }
	
    public static void update(int position,String value) {
    	
    	int idx = 0;
    	while(head != null) {
    		if(idx == position) {
    			head.data = value;
    			break;
    		}
    		idx++;
    		head = head.next;
    	}
    }
	
    public static void addAtEnd(String value) {
    	Node node = new Node(value);
    	if(head == null) {
    		head = node;
    		return;
    	}
    	Node temp = head;
    	while(temp.next != null) {
    		temp = temp.next;
    		
    	}
    	
    	temp.next = node; 
    }
    
    static void addNodeAtFirst(String data) {
  	Node node = new Node(data);
  	
  	node.next = head;
  	head = node;
  	

}

    static void insert(int pos,String data){
      
	  if(pos == 0) {
		  Node node = new Node(data);
		  node.next = head;
		  head = node;
		  return;
	  }
      
      Node temp = head;
      for(int i = 0; i < pos - 1; i++) {
    	  if(temp == null) {
    		  System.out.println("Target index is greater than linked list length");
    		  return ;
    	  }
          temp = temp.next;
      }
      
      Node newNode = new Node(data);
      
      Node tempNextNode = temp.next;
      temp.next = newNode;
      newNode.next = tempNextNode;
      
      
  }
  
  public static void deleteAtFirst() {
	  head = head.next;
  }
   
  public static void deleteAtEnd() {
	  Node temp = head;
	  if(temp == null) {
		  return;
	  }
	  
	  if(head.next == null) {
		  head =null;
		  return;
	  }
	  while(temp.next.next != null) {
		  temp = temp.next;
	  }
	  temp.next = null;
  }
  
  public static void deleteAtIndex(int pos) {
	  Node temp = head;
	  if(temp == null || pos < 0) {
		  return;
	  }
	  if(pos == 0) {
		  deleteAtFirst();
		  return;
	  }
	  for(int i = 0; i < pos - 1; i++) {
		  temp = temp.next;
		  if(temp.next ==  null) {
			  System.out.println("Index out of range");
			  return;
			}
	  }
	  temp.next = temp.next.next;
  }
  
  public static void deleteByValue(String val) {
	  Node temp = head;
	  if(head == null) {
		  return;
	  }
	  if(head.data.equals(val)) {
		  deleteAtFirst();
		  return;
	  }
	  while(!temp.next.data.equals(val)) {
		  temp = temp.next;
		  if(temp.next ==  null) {
			  System.out.println("value is not present");
			  return;
			}
	  }
	  temp.next = temp.next.next;
  }
  
  
  public static void reverseLL() {
	  Node prev = null;
	  Node current = head;
	  
	  while(current != null) {
		  Node nextNode = current.next;
		  current.next = prev;
		  prev = current;
		  current = nextNode;
	  }
	  head = prev;;
  }
  
  public static boolean isCycle() {

	  // Using Floyd's Cycle decting algo     SlowPointer  and  Fast Pointer
	  
	  Node sp = head;
	  Node fp = head;
	  
	  while(sp != null && fp != null && fp.next != null) {
		  sp = sp.next;
		  fp = fp.next.next;
		  if(sp == fp) {
			  return true;
		  }
	  }
	  return false;
	  
	  
	  
	  // Using hash Set  TC = O(N),  SC = O(N)
	  
	  //	  Node temp = head;
//	  HashSet<Node> hs = new HashSet<>(); 
//	  while(temp != null) {
//		  if(hs.contains(temp)) {
//			  return true;
//		  }
//		  hs.add(temp);
//		  temp = temp.next;
//	  }
//	  return false;
  }
  
  
  
  public static int cycleLen() {
	  Node sp = head;
	  Node fp = head;
	  while(sp != null && fp != null && fp.next != null) {
		  sp = sp.next;
		  fp = fp.next.next;
		  if(sp == fp) {
			  int cnt = 1;
			  sp = sp.next;
			  while(sp != fp) {
				  sp = sp.next;
				  cnt++;
			  }
			  return cnt;
		  }
	  }
	  return 0;
  }
	public static void main(String[] args) {
		   
		   //addNodeAtFirst("A");
		
//	       Node node1 = new Node("Aj"); 
//	       Node node2 = new Node("B");
//	       Node node3 = new Node("C");
//	       Node node4 = new Node("D");
//	       node1.next = node2;
//	       node2.next = node3;
//	       node3.next = node4;
	       
	     // head = node1;
		  addAtEnd("A");
	      addAtEnd("B");
	      addAtEnd("C");
	      addAtEnd("D");
	      addAtEnd("E");
	      
	     //head.next.next.next.next.next = head.next;
	     
	    System.out.println(cycleLen()); 
	    // System.out.println(isCycle());
	      
	      // reverseLL();
	      
	      //deleteAtFirst();
	     // deleteAtEnd();
	     // deleteAtIndex(5);
	      //deleteByValue("e");
	      //printLinkedList();
	      
//	     System.out.println();
//	      //addAtEnd(head,"E");
//	      
//	     // addNodeAtFirst(head,"firNode");
//	    insert(2,"ajay");
//	    System.out.println();
//	     
//	      printLinkedList();

//	      System.out.println("hi");
//	      printLinkedList(head);
	      
	      
	      //update(head,2,"hi machha");
//	      System.out.println("");
//	      printLinkedList(head);
	      
	     
	      //System.out.println(LLlength(head));
	     
	     // search
	     //System.out.println(search(head,"C"));
	      
	}

}
 {
    
}
