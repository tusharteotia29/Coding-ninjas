import java.util.Scanner;
import java.lang.Math;
public class binarytodecimal {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=0;
        int rem=0;
        int dec=0;
        while (n>0) {
            rem=n%10;
            n=n/10;
            dec=(int)(dec+(rem*Math.pow(2, i)));
            ++i;

        }
        System.out.print(dec);
    }
    
}
