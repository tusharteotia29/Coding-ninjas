/*  You are given two numbers, ‘X’ and ‘Y’. Your task is to find the greatest common divisor of the given two numbers.
The Greatest Common Divisor of any two integers is the largest number that divides both integers.
For Example:
 You are given ‘X’ as 20 and ‘Y’ as 15. The greatest common divisor, which divides both 15 and 20, is 5. Hence the answer is 5.*/

/*Sample Input 1:
2
20 15
8 32
Sample Output 1:
5
8
Explanation:
For the first test case, the greatest common divisor which divides both 15 and 20 is 5. Hence the answer is 5.

For the second test case, the greatest common divisor which divides both 8 and 32 is 8. Hence the answer is 8. */ 

import java.util.Scanner;

public class greatestcommondivisor {
    public static int gcdfunc(int a, int c){
        int gcd=1;
        for (int i = 1; i <=a && i<=c; i++) {
            if (a%i==0 && c%i==0) {
                gcd=i;

                
            }

            
        }
        return gcd;


    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            int b=s.nextInt();
            int d=s.nextInt();
            System.out.println(gcdfunc(b,d));
            
        }
        
    }
    
}
