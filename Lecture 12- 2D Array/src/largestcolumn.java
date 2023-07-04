public class largestcolumn {

    public static int largestsum(int input[][]){
        int maxm=Integer.MIN_VALUE;
        int rows=input.length;
        int cols=input[0].length;

        for (int j = 0; j < cols;j++) {
            int sum=0;
            for (int i = 0; i < rows; i++) {
                sum+=input[i][j];
                
            }
            if (sum>maxm) {
                maxm=sum;

                
            }
            
        }
        return maxm;
    }

    public static void main(String[] args) {
          int arr[][] = {{1, 2, 3}, {4, 5,6}};
        int largestColSum = largestsum(arr);
        System.out.println(largestColSum); // Output 9
        
    }
    
}
