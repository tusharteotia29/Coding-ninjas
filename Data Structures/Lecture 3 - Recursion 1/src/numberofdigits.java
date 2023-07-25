public class numberofdigits {

    public static int countDigits(int n){
        // Write your code here
        
        if(n/10==0){
            return 1;
        }
        int smallans=countDigits(n/10);
        return smallans+1;

     }

    

    public static void main(String[] args) {
        
    }
    
}
