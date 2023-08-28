public class insert_recursively {

    public static Node<Integer> insert(Node<Integer> head,int pos,int elem){
        if (pos==0) {
            Node<Integer> newnode=new Node<>(elem);
            newnode.next=head;
            return newnode;
            
        }
        if (head==null) {
            return head;
            
        }
        head.next=insert(head, pos-1, elem);
        return head;
    }

    public static void main(String[] args) {
        
    }
    
}
