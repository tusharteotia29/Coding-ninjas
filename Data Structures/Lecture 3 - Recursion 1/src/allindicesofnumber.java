/*Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in the output array (in increasing order).
Do this recursively. Indexing in the array starts from 0.
Hint:
Try making a helper function with the required arguments and call the helper function from the allIndexes function.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
Return the size of the output array
Constraints :
1 <= N <= 10^3
Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4 */

public class allindicesofnumber{

    public static int[] allIndexes(int input[], int x) {

        return allIndexes(input, 0, 2);
		
		
	}

    public static int[] allIndexes(int input[], int start, int num){

        if (start==input.length) {

            return new int[0];
            
        }

        int smallans[]=allIndexes(input, start+1, num);
        if (input[start]==num) {
            int ans[]=new int[smallans.length+1];
            ans[0]=start;
            for (int i = 0; i < smallans.length; i++) {
                ans[i+1]=smallans[i];
                
                
            }
            return ans;
            
        }
        return smallans;
    }


    public static void main(String[] args) {

        int arr[]={1,2,3,4,2,2};
        int ans[]=allIndexes(arr, 2);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
            
        }

        
        
    }
}