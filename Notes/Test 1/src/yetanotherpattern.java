// Example : Pattern for N = 4

// ****
//  ***     
//   **
//    *

// Sample Input 1:
// 2
// 3
// 2
// Sample Output 1:
// ***
//  **     
//   *

// **
//  *     



import java.util.Scanner;
public class yetanotherpattern {
   public static void pattern(int n){
        int i=1;
        while (i<=n) {
            int j=1;
            while (j<=i-1) {
                System.out.print(" ");
                j++;
            }
            j=1;
            while (j<=n-i+1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;   
        }

    }

	public static void main(String[] args)  
	{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i <n; i++) {
            int c=s.nextInt();
            pattern(c);
            
        }
    
}
}
