public class removeduplicates {

    public static String removeConsecutiveDuplicates(String s){

        
       
       
        
        if(s.length()==1){
			return s;
		}
		String smallO = removeConsecutiveDuplicates(s.substring(1));
		if(s.charAt(0)==smallO.charAt(0)){
			return smallO;
		}
		else{
			return s.charAt(0)+smallO;
		}
		
    }

    public static void main(String[] args) {

        String s= "aabbaaccsafdf";
        System.out.println(removeConsecutiveDuplicates(s));

        
    }
    
}