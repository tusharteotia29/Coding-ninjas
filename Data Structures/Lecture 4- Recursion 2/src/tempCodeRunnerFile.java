public static int search(int []nums, int target, int si, int ei) {

        if (si>ei) {
            return -1;
            
        }
        int midindex=(si+ei)/2;
        if (nums[midindex]==target) {
            return midindex;
            
        }else if (nums[midindex]<x) {
            return search(nums, target, midindex+1, ei);
            
        }else{
            return search(nums, target, si, midindex-1);
        }
        // Write your code here.
    }
