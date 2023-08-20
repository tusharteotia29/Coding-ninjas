class Node<T> {
    	T data;
    	Node<T> next;
    
    	public Node(T data) {
        	this.data = data;
    	}
	}
public class appendlastNtofirst {

    
    
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        Node<Integer> temp=head;
		Node<Integer> tail=head;
		Node<Integer> newhead=null;
		
		if (n==0) {
			return head;
			
		}
		int size=0;
		while (tail!=null) {
			tail=tail.next;
			size++;
			
		}
		
		if (size<n) {
			return head;
		}
		int count=size-n;
		for (int i = 0; i < count-1; i++) {
			temp=temp.next;
			
		}
		newhead=temp.next;
		temp.next=null;
		
		if (tail==null) {
			tail=head;
			
			head=newhead;
		

			
		}


		// // tail=head.next;






		return newhead;
   
}
    public static void main(String[] args) {
        
    }
}
