/*Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
Return empty string for numbers 0 and 1.
Note :
1. The order of strings are not important.
2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.
Input Format :
Integer n
Output Format :
All possible strings in different lines
Constraints :
1 <= n <= 10^6
Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf */


public class returnkeypad {


    public static String[] keypad(int n){

        if (n==0 || n==1) {
            String ans[]={""};
            return ans;
            
        }

        int neW=n%10;
        String ans[]=keypad(n/10);
        String helpans=helper(neW);
        String finalans[]=new String[helpans.length()*ans.length];

        int k=0;
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < helpans.length(); j++) {
                finalans[k]=ans[i]+helpans.charAt(j);
                k++;
            }
            
        }
        return finalans;
	}



    public static String helper(int n){

        if (n==2) {
            return "abc"; 
        }

        if (n==3) {
            return "def";
        }

        if (n==4) {
            return "ghi";
        }

        if (n==5) {
            return "jkl";
        }

        if (n==6) {
            return "mno";
        }

        if (n==7) {
            return "pqrs";  
        }

        if (n==8) {
            return "tuv";
        }

        if (n==9) {
            return "wxyz";
        }

        else{
            return "";
        }


    }

    public static void main(String[] args) {

        String ans[]=keypad(234);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
            
        }
        
    }
    
}
