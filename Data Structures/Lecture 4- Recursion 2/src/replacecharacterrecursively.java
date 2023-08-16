public class replacecharacterrecursively {


    public static String replaceCharacter(String input, char c1, char c2){

        if (input.length()==0) {
            return "";
            
        }
        String ans="";
        if (input.charAt(0)==c1) {
            ans=ans+c2;          
        }
        else{
            ans=ans+input.charAt(0);
        }

        String smallans=replaceCharacter(input.substring(1), c1, c2);
        return ans+smallans;
    }
    public static void main(String[] args) throws Exception {
        String str="abaaabbc";
        System.out.println(replaceCharacter(str, 'a', 'x'));
        
    }
}
