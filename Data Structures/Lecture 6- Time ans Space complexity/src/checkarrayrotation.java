public class checkarrayrotation {

    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
        int index=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                index= i+1;

                
            }
            

        }
        return index;
    }
    
    
    
    public static void main(String[] args) {
        int[] arr1={5,8,9,1,3,4};
        System.out.println(arrayRotateCheck(arr1));
        
    }
    
}
