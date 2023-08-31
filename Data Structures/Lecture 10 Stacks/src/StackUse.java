public class StackUse {
    public static void main(String[] args) throws StackFullException{

        StackUsingArrays stack=new StackUsingArrays(3);
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
            
        }
        while (!stack.isempty()) {
            try {
                System.out.println(stack.pop());
                
            } catch (StackEmptyException e) {
                // TODO: handle exception
            }
            
        }

        
    }
    
}
