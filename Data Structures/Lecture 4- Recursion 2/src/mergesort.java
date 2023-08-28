/*Merge Sort Code
Send Feedback
You are given the starting 'l' and the ending 'r' positions of the array 'ARR'.


You must sort the elements between 'l' and 'r'.


Note:
Change in the input array itself. So no need to return or print anything.
Example:
Input: ‘N’ = 7,
'ARR' = [2, 13, 4, 1, 3, 6, 28]

Output: [1 2 3 4 6 13 28]

Explanation: After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
Input format :
The first line contains an integer <em>**'N'**</em> representing the size of the array/list.

The second line contains 'N' single space-separated integers representing the elements in the array/list.
Output format :
You don't need to return anything. In the output, you will see the array after you do the modification.
Sample Input 1:
7
2 13 4 1 3 6 28
Sample Output 1:
1 2 3 4 6 13 28
Explanation of Sample Output 1:
After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
Sample Input 2:
5
9 3 6 2 0
Sample Output 2:
0 2 3 6 9
Explanation of Sample Output 2:
After applying 'merge sort' on the input array, the output is [0 2 3 6 9].
Constraints :
1 <= N <= 10^3
0 <= ARR[i] <= 10^9 */

public class mergesort {

    public static void sort(int[] arr, int l, int r){
        
       
        if (l < r) {
 
            
            int m = l + (r - l) / 2;
 
            
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
          
            merge(arr, l, m, r);

    }
}

    public static void merge(int[] arr,int l,int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
 
        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
       
        int i = 0, j = 0;
 
       
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
            
        
    }

    public static void main(String[] args) {
        int arr[]={45,23,56,53,5,3,2,65,35,99};
      

        sort(arr, 0, 6);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
        
    }
    
}
