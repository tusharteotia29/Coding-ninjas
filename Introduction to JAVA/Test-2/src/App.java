public class App {
    public static void print2DArray(int input[][]) {
		// Write your code here
		 int rows=input.length;
        int cols=input[0].length;        
        for (int i = 0; i < input.length; i++) {
            int n=rows-i;
            while (n!=0) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(input[i][j]+" ");                    
                }
                n--;
                System.out.println();
                
            }
            
        }	

	}
    public static void main(String[] args) {
        int input1[][]={{1,2,3},{4,5,6},{7,8,9}};
        print2DArray(input1);
        
    }
}

