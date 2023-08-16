public class binarysearch {

    public static int search(int []nums, int target, int si, int ei) {

        if (si>ei) {
            return -1;
            
        }
        int midindex=(si+ei)/2;
        if (nums[midindex]==target) {
            return midindex;
            
        }else if (nums[midindex]<target) {
            return search(nums, target, midindex+1, ei);
            
        }else{
            return search(nums, target, si, midindex-1);
        }
        // Write your code here.
    }

    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6,7,78};
        System.out.println(search(a,4 , 0, a.length-1));
        
    }
    
}
