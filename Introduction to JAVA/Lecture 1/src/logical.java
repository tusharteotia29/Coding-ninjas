import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        boolean islargest = (a>=b)&&(a>=c);
        System.out.println(islargest);
        System.out.println((a>=b)||(a>=c));
        System.out.println(!(a>=b));
    
}
}