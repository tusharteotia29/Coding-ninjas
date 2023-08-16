import java.util.Scanner;

public class interestingalphabets {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        char startingchar=(char)('A'+n-1);
        
        while (i<=n) {
            startingchar=(char)('A'+n-i);
            int j=1;
            char printchar=startingchar;
            while (j<=i) {
                
                System.out.print(printchar);
                printchar=(char)(startingchar+j);
                j++;
            }
            System.out.println();
            i++;

            
        }

        
    }
    
}
