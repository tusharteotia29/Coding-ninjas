import java.util.Scanner;
import java.lang.Math;

public class power {
    public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner (System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        double powr;
        if (x>=0 && x<=8 && n>=0 && n<=9) {
            powr=Math.pow(x, n);
            System.out.println(Math.round(powr));
            
        }
        
    }
    
}
