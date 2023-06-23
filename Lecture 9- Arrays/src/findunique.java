public class findunique {

    public static int findunique(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int index=-1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    index++;
                    
                }
                
            }
            if (index==0) {
                return arr[i];
                
            }
            
        }
        return arr[0];
    }
    public static void main(String[] args) {
        // int arr1[]=new int[6];
        int arr1[]={1,1,2,3,3,4,4};
        System.out.println(findunique(arr1));
        
    }
    
}
