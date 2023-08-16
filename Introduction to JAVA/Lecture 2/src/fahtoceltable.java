import java.util.Scanner;

public class fahtoceltable {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int s=n.nextInt();
        int e=n.nextInt();
        int w=n.nextInt();
        int cel;
        if (s>=0 && s<=90 && e<=900 && e>=0 && w>=0 && w<=80) {
            while (s<=e) {
                cel=(int)((5.0/9)*(s-32));
                System.out.println(s+"\t"+cel);
                s=s+w;   
            }
        }
        else{
            return;
        }
        
        
    }
    
}
