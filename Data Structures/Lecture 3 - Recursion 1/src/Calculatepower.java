public class Calculatepower {

    public static int power(int x, int n) {

        if (n==0) {
            return 1;
            
        }

        int op=power(x, n-1);

        int output=x*op;

        return output;

    }

    public static void main(String[] args) {

        int x=power(2, 4);
        System.out.println(x);
        
    }
    
}
