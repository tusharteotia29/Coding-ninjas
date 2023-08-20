public class does_s_contain_t_ {

    public static boolean checkSequence(String a, String b) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        if (b.length()==0) {
            return true;
        }

        if (a.length()==0) {
            return false;
            
        }

        if (a.charAt(0)==b.charAt(0)) {
            a=a.substring(1);
            b=b.substring(1);

            
        }

        else{
            a.substring(1);
        }
        boolean ans=checkSequence(a, b);

        return ans;
	}
    public static void main(String[] args) {
        
    }
    
}
