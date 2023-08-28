/*Swap Two Nodes of Linked List
Send Feedback
You have been given a singly linked list of integers along with two integers, 'i,' and 'j.' Swap the nodes that are present at the 'i-th' and 'j-th' positions.
Note :
Remember, the nodes themselves must be swapped and not the datas.

No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space.

The second line of input contains two integer values 'i,' and 'j,' respectively. A single space will separate them.
 Remember/consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.
0 <= i < M
0 <= j < M

Time Limit: 1sec
Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3 4
Sample Output 1 :
3 4 5 6 2 1 9 
 Sample Input 2 :
2
10 20 30 40 -1
1 2
70 80 90 25 65 85 90 -1
0 6
 Sample Output 2 :
10 30 20 40 
90 80 90 25 65 85 70  */

package Assignment;

class Node<T> {
        T data;
        Node<T> next;
    
        public Node(T data) {
            this.data = data;
        }
    }

public class swap_two_nodes_of_LL {

    public static Node<Integer> findprev(Node<Integer> head, int count){

        for (int i = 0; i < count-1; i++) {
            head=head.next;
            
        }
        return head;
    }




    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {

        if (head==null) {
            return head;
            
        }
        else if (j==0 || i-j==-1) {
            int temp=i;
            i=j;
            j=temp;

            
        }
		//Your code goes here
        Node<Integer> curr1=null,curr2=null, prev1=null,prev2=null,f1=null,f2=null;
        if (i==0 && i-j==1) {
            curr1=head;
            curr2=head.next;
            f2=curr2.next;

            head=curr2;
            curr2.next=curr1;
            curr1.next=f2;

            
        }
        else if (i==0) {
            curr1=head;
            f1=curr1.next;
            prev2=findprev(head, j);
            curr2=prev2.next;
            f2=curr2.next;
            head=curr2;
            curr2.next=f1;

            prev2.next=curr1;
            curr1.next=f2;
            
        }

        else if (i-j==1) {
            prev1=findprev(head, i); // doubt in this line
            curr1=prev1.next;
            curr2=curr1.next;
            f2=curr2.next;

            prev1.next=curr2;
            curr2.next=curr1;
            curr1.next=f2;

        }
        else{
            prev1=findprev(head, i);
            prev2=findprev(head, j);
            curr1=prev1.next;
            curr2=prev2.next;
            f1=curr1.next;
            f2=curr2.next;

            prev1.next=curr2;
            prev2.next=curr1;
            curr1.next=f2;
            curr2.next=f1;

        }
        return head;
	}

    


    
    
}
