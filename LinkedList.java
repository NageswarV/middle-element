import java.io.*; 

public class LinkedList { 

	Node head;  
	static class Node { 

		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 
	public static LinkedList insert(LinkedList list, int data) 
	{ 
		Node new_node = new Node(data); 
		new_node.next = null;  
		if (list.head == null) { 
			list.head = new_node; 
		} 
		else {  
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			last.next = new_node; 
		} 
		return list; 
	} 
	public static int midList(LinkedList list)
	{int count=0;
	Node temp=list.head;
	while(list.temp != null)
	{count++;
	temp=temp.next;
	}
	temp=list.head;
	while(count--!=0)
	temp=temp.next;
	return temp.data;	
 	}
	public static void main(String[] args) 
	{ 
		LinkedList list = new LinkedList(); 

		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 5); 
		list = insert(list, 6); 
		list = insert(list, 7); 
		list = insert(list, 8); 
		System.out.println(midList(list)); 
	} 
} 
