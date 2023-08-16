public class printsubsequences {

    public static void printsubsequences(String input, String output){
        if (input.length()==0) {
            System.out.println(output);
            return;
            
        }

        printsubsequences(input.substring(1), output);
        printsubsequences(input.substring(1), output+input.charAt(0));
    }

    public static void printsubsequences(String input){

        printsubsequences(input, "");
    }

    public static void main(String[] args) {

        printsubsequences("xy");
        
    }
    
}
