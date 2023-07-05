public class removecharacter {

    public static String removealloccurencesofChar(String str, char ch){
        
        if (str.length()==0) {
            return str;
            
        }
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=ch) {
                result+=str.charAt(i);
                
            }
            
        }
        return result;

    }
    public static void main(String[] args) {
        String str = "suumiit";
        System.out.println(removealloccurencesofChar(str, 'i'));
    }
    
}
