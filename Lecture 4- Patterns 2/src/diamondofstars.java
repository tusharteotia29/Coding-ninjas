import java.util.Scanner;

public class diamondofstars {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int c=((n/2)+1);
        while (i<=c) {
            int j=1;
             while (j<=c-i) {
                System.out.print(" ");
                j++;
            }
            j=1;
            while (j<=(2*i-1)) {
                System.out.print("*");
                j++;
                
            }
            
            System.out.println();
            i++;
        }
        i=1;
        while (i<=c-1) {
            int j=1;
            while (j<=i) {
                System.out.print(" ");
                j++;
            }
            j=1;
            while (j<=((2*(c-i))-1)) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;   
        }
    }
}
