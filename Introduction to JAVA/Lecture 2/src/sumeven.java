import java.util.Scanner;
public class sumeven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int i=2;
        int sum=0;
        while (i<=n) {
            if(i%2==0){
                sum=sum+i;
                i=i+1;  
                }
            else{
                i=i+1;
                }
        

        
    }
    System.out.println(sum);
    
}
}
