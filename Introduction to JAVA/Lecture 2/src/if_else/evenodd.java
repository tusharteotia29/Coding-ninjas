package if_else;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rem=n%2;
        if(rem==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        
    }
    
}

// import java.util.Scanner;

// public class evenodd {
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         int n=s.nextInt();
//         int rem=n%2;
//         if(rem==0){
//             System.out.println("even");
                // return;
//         }
//             System.out.println("odd");
//         
        
//     }
    
// }
