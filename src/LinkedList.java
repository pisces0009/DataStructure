
public class LinkedList {
	 Node head; 
	 
	    
	    class Node
	    {
	        int data;
	        Node next;
	        Node(int d) 
	        {
	        	data = d;
	        	next = null; 
	        }
	    }
	 
	    //insert at the start
	    public void push(int new_data)
	    {
	        Node new_node = new Node(new_data);
	        new_node.next = head;
	        head = new_node;
	    }
	 
	    // insert anywhere after the first node n before the null
	    public void insertAfter(Node prev_node, int new_data)
	    {
	        
	        if (prev_node == null)
	        {
	            System.out.println("The given previous node cannot be null");
	            return;
	        }
	 
	        
	        Node new_node = new Node(new_data);
	        new_node.next = prev_node.next;
	        prev_node.next = new_node;
	    }
	    
	   //insert new node at the last
	    public void insertLast(int new_data)
	    {
	       
	        Node new_node = new Node(new_data);
	 
	        if (head == null)
	        {
	            head = new Node(new_data);
	            return;
	        }
	 
	     
	        new_node.next = null;
	 
	        
	        Node last = head; 
	        while (last.next != null)
	            last = last.next;
	 
	        
	        last.next = new_node;
	        return;
	    }
	    
	    //delete the node by indexing the position
	    void deleteNode(int position)
	    {
	        
	        if (head == null)
	            return;
	 
	        
	        Node temp = head;
	 
	        
	        if (position == 0)
	        {
	            head = temp.next;   // Change head
	            return;
	        }
	 
	        
	        for (int i=0; temp!=null && i<position-1; i++)
	            temp = temp.next;
	 	      
	        if (temp == null || temp.next == null)
	            return;
	 
	        
	        Node next = temp.next.next;
	 
	        temp.next = next;  
	    }
	 
	    
	    public void printList()
	    {
	        Node tnode = head;
	        while (tnode != null)
	        {
	            System.out.print(tnode.data+" ");
	            tnode = tnode.next;
	        }
	    }
	 
	   
	    public static void main(String[] args)
	    {
	      
	        LinkedList llist = new LinkedList();
	 
	        llist.insertLast(3);
	       
	        llist.push(30);
	 
	        llist.push(12);
	        
	        llist.push(47);
	       
	        llist.insertLast(9);
	 
	        llist.insertAfter(llist.head.next, 6);
	        
	        llist.insertAfter(llist.head.next, 7);
	 
	        System.out.println("\nLinked list is: ");
	        llist.printList();
	        
	        //deletes the node at the position 3
	        llist.deleteNode(5); 
	        System.out.println("\nLinked List after Deletion: ");
	        llist.printList();
	    }

}
