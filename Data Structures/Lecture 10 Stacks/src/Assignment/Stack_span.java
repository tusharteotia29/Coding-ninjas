import java.util.Stack;
package Assignment;

public class Stack_span {

    public static int[] stockSpan(int[] price) {
		//Your code goes here

        int[] span=new int[price.length];
        Stack<Integer> st=new Stack<Integer>();
        st.push(0);
        span[0]=1;

        for (int i = 1; i < price.length; i++) {
            while (st.size()>0 && price[i]>price[st.peek()]) {
                st.pop();
                
            }
            if (st.size()>0) {
                span[i]=i+1;
                
                
            }
            else{
                span[i]=i-st.peek();
            }
            st.push(i);

            
        }
        return span;
	}
    
}
