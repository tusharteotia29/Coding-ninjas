public class StackUsingLL<T> {

    private Node<T> head;
    private int size;

    public StackUsingLL(){
        head=null;
        size=0;
    }

    public boolean isempty(){
        return (size()==0);
    }

    public int size(){
        return size;
    }

    public T top() throws StackEmptyException{
        // StackEmptyException e=new StackEmptyException();
        // throw e;
        if (size()==0) {
             throw new StackEmptyException();
        }

       

        return head.data;
    }

    public void push(T element){
        Node<T> newnode=new Node<T>(element);
        newnode.next=head;
        head=newnode;
        size++;

    }

    public T pop() throws StackEmptyException{
        if (size()==0) {
             throw new StackEmptyException();
        }

        T temp=head.data;
        head=head.next;
        size--;
        return temp;

    }
    
}
