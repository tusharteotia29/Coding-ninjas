import java.util.Scanner;

public class termsofap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while (i<=n) {
            int ser=3*i+2;
            if (ser%4==0) {
                i++;
                n++;
                continue;   
            }
            else{
            System.out.print(ser+" ");
            }
            i++;
        }
    }
}
