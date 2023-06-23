import java.util.Scanner;
public class oddsquareoattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while (i<=n) {
        int startval=(2*i)-1;
        int maxval=(2*n)-1;
        int j=1;

        while (j<=n) {
            System.out.print(startval);
            startval=startval+2;
            if (startval>maxval) {
                startval=1;
            }
            j++;
        }   
        i++;
        System.out.println();
    }
}
    
}
