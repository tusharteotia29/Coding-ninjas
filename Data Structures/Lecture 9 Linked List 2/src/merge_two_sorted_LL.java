 /*Code : Merge two sorted LL
Send Feedback
You have been given two sorted(in ascending order) singly linked lists of integers.
Write a function to merge them in such a way that the resulting singly linked list is also sorted(in ascending order) and return the new head to the list.
Note :
Try solving this in O(1) auxiliary space.

No need to print the list, it has already been taken care.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the first sorted singly linked list separated by a single space. 

The second line of the input contains the elements of the second sorted singly linked list separated by a single space. 
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output :
For each test case/query, print the resulting sorted singly linked list, separated by a single space.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t = 10^2
0 <= N <= 10 ^ 4
0 <= M <= 10 ^ 4
Where N and M denote the sizes of the singly linked lists. 

Time Limit: 1sec
Sample Input 1 :
1
2 5 8 12 -1
3 6 9 -1
Sample Output 1 :
2 3 5 6 8 9 12 
Sample Input 2 :
2
2 5 8 12 -1
3 6 9 -1
10 40 60 60 80 -1
10 20 30 40 50 60 90 100 -1
Sample Output 2 :
2 3 5 6 8 9 12 
10 10 20 30 40 40 50 60 60 60 80 90 100 */
 
 class Node<T> {
        T data;
        Node<T> next;
    
        public Node(T data) {
            this.data = data;
        }
    }

public class merge_two_sorted_LL {

    public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
        //Your code goes here
        if (head1==null) {
            return head2;
            
        }
        if (head2==null) {
            return head1;
            
        }
        Node<Integer> temp1=head1,temp2=head2,newhead=null,tail=null;
        if (temp1.data<temp2.data) {
            newhead=head1;
            temp1=temp1.next;
            
        } else {
            newhead=head2;
            temp2=temp2.next;
            
        }
        tail=newhead;
        while (temp1!=null && temp2!=null) {
            if (temp1.data<temp2.data) {
                tail.next=temp1;
                tail=tail.next;
                temp1=temp1.next;
                
            } else {
                tail.next=temp2;
                tail=tail.next;
                temp2=temp2.next;
            }
            
        }

        while (temp1!=null) {
            tail.next=temp1;
            tail=tail.next;
            temp1=temp1.next;
            
        }
        while (temp2!=null) {
            tail.next=temp2;
            tail=tail.next;
            temp2=temp2.next;
            
        }
        return newhead;
    }
    public static void main(String[] args) {
        
    }
}
