import java.util.Scanner;

public class relational {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i = scan.nextInt();
        int j=scan.nextInt();

        boolean iseq= i==j;
        System.out.println("is equal"+iseq);

        boolean neq= i!=j;
        boolean leseq= i<=j;
        boolean les= i<j;
        boolean greq= i>=j;
        boolean gre= i>j;

        System.out.println("not equal"+neq);
        System.out.println("is less than equal"+leseq);
        System.out.println("is less"+les);
        System.out.println("is greater than equal"+greq);
        System.out.println("is geater"+gre);
        

}
}