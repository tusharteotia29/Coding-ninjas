public class replacepi {


    public static String replace(String input){
		// Write your code here

		if (input.length()==0 || input.length()==1) {
			return input;
			
		}

		if (input.charAt(0)=='p' && input.charAt(1)=='i') {
			String smalloutput=replace(input.substring(2));
			return "3.14"+smalloutput;
			
		}

		else{
			String smalloutput=replace(input.substring(1));
			return input.charAt(0)+smalloutput;
		}

	}
    public static void main(String[] args) throws Exception {

        String str="pipiasdapi";
        System.out.println(replace(str));
       
    }
}
