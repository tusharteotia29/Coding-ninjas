// Print the following pattern for given number of rows.
// Input format :
// Integer N (Total number of rows)
// Output Format :
// Pattern in N lines
// Sample Input :
//    5
// Sample Output :
//  5432*
//  543*1
//  54*21
//  5*321
//  *4321



import java.util.Scanner;

public class numberstarpattern {
    
        public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		// Write your code here
		int i=1;
	while(i<=n){
            int j=1;
            
            while (j<=n) {
                if (j==(n-i+1)) {
                    System.out.print("*");
                    j++;
                    continue;
                    
                }
                System.out.print(n-j+1);
                j++;
                
            }
            System.out.println();
            i++;
        }
	}
    }

