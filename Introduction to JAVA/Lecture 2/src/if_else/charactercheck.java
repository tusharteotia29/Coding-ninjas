package if_else;
import java.util.Scanner;
public class charactercheck {

    public static void main(String[] args) throws Exception {
        
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char c=str.charAt(0);
        int ch_as=c;
        
        if (ch_as>=65 && ch_as<=90) {
            System.out.println(1);
            
        }
        else if (ch_as>=97 && ch_as<=122) {
            System.out.println(0);    
        }
        else{
            System.out.println(-1);
        }
    }
        }
    
