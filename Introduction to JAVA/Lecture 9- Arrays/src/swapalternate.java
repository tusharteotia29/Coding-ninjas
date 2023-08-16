public  class swapalternate {
     public static void swapAlternate(int arr[]) {
       int n=arr.length;
     
        int i=0;
        
             while (i<n-1) {
               int c=arr[i];
               arr[i]=arr[i+1];
               arr[i+1]=c;
                i+=2;
             }

        // }
     }
    public static void main(String[] args) {
        int n=9;
        System.out.println(n/2);
        
    }
    
}
