import java.util.Scanner;

public class allcharsofstring{

    public static void printchars(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            
        }
        
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        printchars(str);
    }
}