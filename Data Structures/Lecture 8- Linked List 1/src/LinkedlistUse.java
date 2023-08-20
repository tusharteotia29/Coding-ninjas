import javafx.scene.Node;
import java.util.Scanner;

public class LinkedlistUse {

    public static node<Integer> takeinput(){
        node<Integer> head=null , tail=null;
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();

        while (data != -1) {
            node<Integer> newnode=new node<Integer>(data);
            if (head== null) {
                head=newnode;
                tail=newnode;

                
            }else{
                // node<Integer> temp=head;
                // while (temp.next != null) {
                //     temp=temp.next;
                    
                // }
                // temp.next=newnode;
                tail.next=newnode;
                tail=newnode;
            }
            data=s.nextInt();
            
        }
        return head;

    }
    public static void print(node<Integer> head){
        node<Integer> temp=head;
        while (head!= null) {
            System.out.print(head.data+" ");
            head=head.next;
            
        }
        System.out.println();
    }
    public static void main(String[] args) {

        
        // node<Integer> node1=new node<Integer>(10);
        // System.out.println(node1.data);
        // System.out.println(node1.next);
        // node<Integer> node2=new node<Integer>(20);
        // node1.next=node2;
        // System.out.println(node2);
        // System.out.println(node1.next);

        // node<Integer> node1=new node<Integer>(10);
        // node<Integer> node2=new node<Integer>(20);
        // node<Integer> node3=new node<Integer>(30);
        // node1.next=node2;
        // node2.next=node3;
        // node<Integer> head=node1;
        // print(head);
        
        // while (head != null) {
        //     System.out.println(head.data+" ");
        //     head=head.next;
            
        // }
        node<Integer> head=takeinput();
        print(head);
    }
    
}
