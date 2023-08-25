package NewtonAssignmentQuestions;
import java.util.*;

public class SinglyLinkedList {
	
	  private Node head;
	  private int length;
	  
	  public int size() {
		  return length;
	  } 
	  
	  public  boolean empty() {
		  if(head == null) {
			  return true;
		  }
		  return false;
	  }
	  
	  public void display() {
		  
		  Node c = head;
		  		  
		  System.out.print("[");

		  while(c!=null) {
			  if(c.next==null) {
				   System.out.print(c.data);

			  }else {
			   System.out.print(c.data+ ",");

			  }
			   c=c.next;
		  }
		  System.out.print("]");
		  System.out.println("");				
	  }
	  
	  public void addFirst(int data) {
		  length++;
		  Node n = new Node(data);
		  if(head==null) {
			    head = n;
		  }else {
			  n.next = head;
			  head = n;
		  }
	  }
     
	  public void addLast(int data) {
		  
		  length++;
		  Node n = new Node(data);
		  
		  if(head == null) {
			  head = n;
			  return;
		  }
		
		  
		  Node c = head;
		  while(c.next!=null) {
			  c = c.next;
		  }
		  c.next = n;
	  }
	  
	  public void add(int data,int pos) {
		  length++;
		  Node new_node = new Node(data);
		  
		    Node c = head;
			if(pos == 0) {
			   addFirst(data);
			   return;
			}
			
			Node  prev = c;
			for(int i=0; c!=null && i<=pos-1;i++) {
				prev=c;
				c=c.next; 
			}
			
			if(c==null || c.next==null ) {
				return;
			}
			prev.next = new_node;
			new_node.next = c;
			
			
		 
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list = new SinglyLinkedList();
		
//     	System.out.println(list.size());
//     	System.out.println(list.empty());
//

	     	list.addFirst(10);
	     	list.addFirst(20);
	     	list.addFirst(30);
	     	list.addLast(40);
	     	list.addLast(50);
	     	list.add(5,5);
	     	list.display();

	     	
//	     	System.out.println(list.size());
//	     	System.out.println(list.empty());

		
	}

}
