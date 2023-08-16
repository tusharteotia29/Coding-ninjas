import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        // String str="abcd";
        // System.out.println(str);

        // String str1=s.nextLine();
        // System.out.print(str1);

        String str2=s.next();
        System.out.println(str2);

        char c=str2.charAt(0);
        System.out.println(c);




        int p=s.nextInt();


        int r=s.nextInt();
        int t=s.nextInt();

        long l=s.nextLong();

        double d=s.nextDouble();
        float f=s.nextFloat();


        int si=(p*r*t)/100;
        System.out.print(si);
    }

}
