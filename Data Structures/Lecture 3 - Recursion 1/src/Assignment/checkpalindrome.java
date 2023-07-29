// Check Palindrome (recursive)
// Send Feedback
// Check whether a given String 'S' is a palindrome using recursion.


// Return true or false.


// Note:
// You don’t need to print anything. Just implement the given function.
// Example:
// Input: s = "racecar"
// Output: true
// Explanation: "racecar" is a palindrome.
// Input Format:
// The first and only line of the input contains string S.
// Output format:
// Return a boolean value True or False.
// Sample Input 1:
// abbba
// Sample Output 1:
// true
// Explanation Of Sample Input 1 :
// “abbba” is a palindrome
// Sample Input 2:
// abcd
// Sample Output 2:
// false
// Explanation Of Sample Input 2 :
// “abcd” is not a palindrome.
// Expected time complexity:
// Expected time complexity is O(n).
// Constraints:
// 0 <= |S| <= 10^6
// where |S| represents the length of string S.


package Assignment;

public class checkpalindrome {

    public static boolean isPalindrome(String str) {
        // Write your code here.
        return isPalindrome(str,0, str.length()-1);
    }

    public static boolean isPalindrome(String str, int si, int ei){
        if(si>=ei){
            return true;

        }
        boolean check=true;
        if (str.charAt(si)==str.charAt(ei)) {
            check=isPalindrome(str,si+1,ei-1);
        }
        else{
            check=false;
        }
        return check;

    }

    public static void main(String[] args) {

        String str="abba";
        
        System.out.println(isPalindrome(str));
    }

    
    
}
