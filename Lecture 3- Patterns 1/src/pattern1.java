import java.util.Scanner;


public class pattern1 {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        // while(i<=n){
        //     int j=1;
        //     while (j<=n) {
        //         System.out.print(n);
        //         j++;
                
        //     }
        //     System.out.println();
        //     i++;
        // }
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
