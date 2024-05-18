package Assignment;
import java.util.Stack;
public class check_redundant_brackets {

    public static boolean checkRedundantBrackets(String expression) {

		//Your code goes here
        Stack<Character> stack=new Stack<Character>();
        int count=0;
        for (int i = 0; i < expression.length(); i++) {
            char c=expression.charAt(i);

            if (c==')' ) {
                while (!stack.isEmpty() && stack.peek()!='(') {

                    count++;
                    stack.pop();

                    
                    
                }
                if (count==0 || count==1) {
                    return true;
                        
                    }
                    stack.pop();
                    count=0;
                
            }
            else{
                stack.push(c);
            }
            return false;
        }

	}

    public static void main(String[] args) {
        
    }
    
}
