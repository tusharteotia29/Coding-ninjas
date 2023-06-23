public class Selectionsort {
    public static void Selectionsort(int input[], int n) {
         for (int i = 0; i < n-1; i++) {
            int min=input[i];
            int minIndex=i;
            for (int j = i+1; j < n; j++) {
                if (input[j]<min) {
                    min=input[j];
                    minIndex=j;
                    
                }
                
            }
            if (minIndex != i) {
                input[minIndex]=input[i];
                input[i]=min;
                
            }
            
        }
    	
    }   
        
    
    public static void main(String[] args) {
        int input[]={2,6,9,1,5};
        Selectionsort(input, 5);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+" ");
            
        }        
    }
    
}
