import java.util.Scanner;
public class reverseofnumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int rem=0;
        while (n>0) {
            rem=rem*10+n%10;
            n=n/10;  
        }
        System.out.print(rem);
    }
    
}
