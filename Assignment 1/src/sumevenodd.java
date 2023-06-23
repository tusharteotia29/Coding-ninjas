import java.util.Scanner;
import java.lang.Math;
public class sumevenodd {
    public static void main(String[] args) {

            // Write your code here
            Scanner s=new Scanner(System.in);
            int number=s.nextInt();
            int sumeve=0;
            int sumodd=0;
            if(number>=0 && number<=Math.pow(10, 8)){
                while(number>0){
                    int remainder=number%10;
                    // System.out.println(remainder);
                    
                    if (remainder%2==0) {
                        sumeve=sumeve+remainder;
                        
                    }
                    else{
                        sumodd=sumodd+remainder;
                        
                    }
                    number=number/10;
    
                }
                System.out.print(sumeve+"\t"+sumodd);
                
        }
    }
            
        
}

    
    