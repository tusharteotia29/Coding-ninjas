import java.util.Scanner;

public class incndecoprator {
    public static void main(String[] args) {
        int a=10;
        // System.out.println(++a); o/p 11
        a++;
        ++a;
        System.out.println(a);// o/p 12

        int b=a++;
        System.out.println(b); // o/p 12
        System.out.println(a); // o/p 13
        
        a=4;
        a*=2;
        System.out.println(a); // o/p 8

        a^=2;
        System.out.println(a); // o/p 10

        int ans=2*3/2;
        System.out.println(ans);

        int ans2=2+3*4;
        System.out.println(ans2);

        a=~2;
        b=~a;
        System.out.println(a);

        int i=729;
        i=i%3;
        System.out.println(i);

        // int a=10,b=20;
        // System.out.println(a+++--b);//line 1
        // System.out.println(a--+++b);//line 2
        // System.out.println(a++-++b);//line 3
        // System.out.println(a+++++b);//line 4

        
    }
    
}
