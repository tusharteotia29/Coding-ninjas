public class pairsum {
    public static int pairSum(int arr[], int x) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i!=j && ((arr[i]+arr[j])==x)) {
                    count++;
                    
                }
                
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        int arr1[]={1,1,2,3,3,4,4};
        System.out.println(pairSum(arr1,3));
        
    }
    
}
