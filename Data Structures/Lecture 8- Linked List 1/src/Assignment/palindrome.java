package Assignment;

public class palindrome {

    public static Node<Integer> middle(Node<Integer> head){
         Node<Integer> slow=head;
        Node<Integer> fast=head;
        while (fast.next!=null && fast.next.next!=null) {

            slow=slow.next;
            fast=fast.next.next;
            
        }
        return slow;
    }

    public static Node<Integer> reverse(Node<Integer> head){
        Node<Integer> curr=head;
        Node<Integer> next=null;
        Node<Integer> prev=null;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

            
        }
        return prev;
    }

    public static boolean isPalindrome(Node<Integer> head) {

        if (head==null || head.next==null) {
            return true;

            
        }
        // step-1 find mid 

        Node<Integer> middle=middle(head);

        // Step-2 reverse after middle
        Node<Integer> temp=middle.next;

        middle.next=reverse(temp);

        // compare both halves


        Node<Integer> head1=head;
        Node<Integer> head2=middle.next;
        while (head2!=null) {
            if(head1.data!=head2.data){
                return false;
            }
            
                head1=head1.next;
                head2=head2.next;
            
            
        }

        return true;

       
		//Your code goes here

	}

    public static void main(String[] args) {
        
    }
}