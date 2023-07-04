import java.util.Scanner;

public class countwords {

    	public static int countWords(String str) {	
		
		int countword=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==' ') {
				countword++;
				
			}

			
		}
		countword++;
		return countword;
	}

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        System.out.println("Words in string"+" "+countWords(str1));
    }
    
}