public class returnsubsequence {

    public static String[] findsubsequnce(String str){

        if (str.length()==0) {
            String ans[]={""};
            return ans;
            
        }

        String smallans[]=findsubsequnce(str.substring(1));
        String ans[]=new String[2*smallans.length];

        int k=0;
        for (int i = 0; i < smallans.length; i++) {
            ans[k]=smallans[i];
            k++;
            
        }

        for (int i = 0; i < smallans.length; i++) {
            // ans[i+smallans.length]
            ans[k]=str.charAt(0)+smallans[i];
            k++;
            
        }

        return ans;
    }

    public static void main(String[] args) {

        String str="xyz";
        String ans[]=findsubsequnce(str);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
            
        }
        
    }
    
}
