public class insertionsort {
    
    public static void insertionsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int j=i-1;
            int temp=arr[i];
            while (j>=0 && arr[j]>temp) {
                arr[j+1]=arr[j];
                j--;
                
            }
            arr[j+1]=temp;
            
        }
        
    }
    public static void main(String[] args) {
         int input[]={8,2,6,1,5};
        insertionsort(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+" ");
            
        }
        
    }
    
}
