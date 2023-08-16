import java.util.Scanner;


public class sumorproduct {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println();
        int c=s.nextInt();
        int i=1;
        if (c==1) {
            int sum=0;
            int j=1;
            while (j<=n) {
                sum=sum+j;
                j++; 

            }
            System.out.println(sum);
                
        }
        else if (c==2) {
            int prod=1;
            i=1;
            while (i<=n) {
                prod=prod*i;
                i++; 
            }
            System.out.println(prod);
            
        }
        else{ 
        System.out.println(-1);
        }


    }
}
    
