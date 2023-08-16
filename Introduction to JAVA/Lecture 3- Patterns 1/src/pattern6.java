import java.util.Scanner;
public class pattern6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int startingnumber=i;
            while (j<=i) {
                System.out.print(startingnumber);
                startingnumber++;
                j++;
                
            }
            System.out.println();
            i++;
        }
    }
    
}