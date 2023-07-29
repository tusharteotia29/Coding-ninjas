/*Check Number in Array
Send Feedback
Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
'true' or 'false'
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true
Sample Input 2 :
3
9 8 10
2
Sample Output 2 :
false */


public class checknumberinarray {

    public static boolean checkNumber(int input[], int x) {
        if (input.length==1) {

            if (input[0]==x) {
                return true;
                
            }
            else{
                return false;
            }
            
        }
        int smallans[]=new int[input.length-1];
        for (int i = 1; i < input.length; i++) {
            smallans[i-1]=input[i];
            
        }
        boolean output=checkNumber(smallans, x);
        return output;
		


		
	}

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,3,2};
        System.out.println(checkNumber(arr, 9));


        
    }
    
}
