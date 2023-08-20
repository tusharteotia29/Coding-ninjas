public class insertnodein_ith_pos {

    public static node<Integer> insert(node<Integer> head, int data, int pos){
        node<Integer> newnode=new node<Integer>(data);
        if (pos==0) {
            newnode.next=head;
            return newnode;
            
        }
        int i=0;
        node<Integer> temp=head;
        while (i<pos-1) {
            temp=temp.next;
            i++;
            
        }
        newnode.next=temp.next;
        temp.next=newnode;
        return head;
    }
    
    public static void main(String[] args) {

        node<Integer> head=taekinput();
        head=insert(head, 80, 0);
        print();
        
    }
}
