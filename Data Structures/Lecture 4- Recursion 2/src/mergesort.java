public class mergesort {

    public static void mergeSort(int[] arr, int si, int ei){
        
        if (si>=ei) {
            return;
            
        }
        int mid=(si+ei)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,ei);

    }

    public static void merge(int input[],int si, int ei){
        int mid=(si+ei)/2;
        int ans[]=new int[ei-si+1];

        int i=si;
        int k=0;
        int j=mid+1;

        while (i<=mid && j<=ei) {
            if (input[i]<input[j]) {
                ans[k]=input[i];
                i++;
                k++;
                
            }else{
                ans[k]=input[j];
                j++;
                k++;


            }
        }

            while (i<=mid) {
                ans[k]=input[i];
                i++;
                k++;
                
            }

            while (j<=ei) {
                ans[k]=input[j];
                k++;
                j++;
                
            }

            for (int index = 0; index < ans.length; i++) {
                input[si+index]=ans[index];

                
            }
            
        
    }

    public static void main(String[] args) {
        int arr[]={45,23,56,53,5,3,2,65,35,99};
        // System.out.print(arr[0]);

        mergeSort(arr, 0, 6);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            
        }
        
    }
    
}
