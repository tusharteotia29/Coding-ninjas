import java.util.Scanner;
import java.lang.Math;
public class factor {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=2;
        int count=0;
        while(i<n){
            if (n%i==0) {
                System.out.print(i+" ");
                count=count+1;
                i=i+1;
            }
            else{
                i=i+1;
            }

        }
        if (count==0){
            System.out.println(-1);
        }


        
    }
    
}
