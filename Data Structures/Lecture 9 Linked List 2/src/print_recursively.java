public class print_recursively {

    public static void printR(Node<Integer> head) {
        if (head==null) {
            return;
            
        }
        System.out.print(head.data+" ");
        printR(head);
        
    }
    public static void main(String[] args) {
        
    }
    
}
