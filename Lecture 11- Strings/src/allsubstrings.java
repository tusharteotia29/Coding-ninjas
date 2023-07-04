public class allsubstrings {

    public static void printsubstrings(String str) {
                

        for (int i = 0; i <= str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
               
                System.out.println(str.substring(i, j));                
            }

            
        }
    }
    public static void main(String[] args) {
        String str2="pqrs";
        printsubstrings(str2);
        
    }
    
}
