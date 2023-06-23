import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int index=0;
        int binary[]=new int[40];
        if (n==0) {
            System.out.println(0);
        }
        else{
            while (n>0) {
                binary[index++]=n%2;
                n=n/2;
            }
            for(int i=index-1;i>=0;i--){
            System.out.print(binary[i]);
            }
        
        }
    }
}