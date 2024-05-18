import java.util.Stack;
package Assignment;

public class minimum_bracket_reversal {

    public static int countBracketReversals(String input) {
		//Your code goes here
        if (input.length()%2==1) {
            return -1;
            
        }
        Stack<Character> stack=new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            char ch=input.charAt(i);
            if (ch=='{') {
                stack.push(ch);
                
            }
            else{
                if(!stack.isEmpty() && stack.peek()=='{'){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }

            }

            
        }
        int a=0, b=0;
        while(!stack.isEmpty()){
            if(stack.peek()=='{'){
                b++;
            }
            else{
                a++;
            }
            stack.pop();
        }
        int ans=(a+1)/2 +(b+2)/2;
        return ans;

	}
    
}
