import java.util.Scanner;
public class array2 {

    public static int largestinarr(int input[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            if (input[i]>max) {
                max=input[i];
                
            }
            
        }
        return max;

    }

    public static int[] takeinput(){
        Scanner s=new Scanner(System.in );
        int size=s.nextInt();
        int input[]=new int[size];
        for (int i = 0; i < size; i++) {
            input[i]=s.nextInt();
            
        }
        return input;

    }

    public static void printarray(int input[]){
        int size=input.length;
        for (int i = 0; i < size; i++) {
            System.out.print(input[i]+" ");
            
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[]=takeinput();
        printarray(arr);
        int largest= largestinarr(arr);
        System.out.println("Largest" + largest);
       
        
    }
    
}
