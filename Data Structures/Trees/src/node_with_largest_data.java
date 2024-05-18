import javax.swing.tree.TreeNode;

public class node_with_largest_data {

    public static int nodelargestdata(TreeNode<Integer> root){

        if (root==null) {
            return Integer.MIN_VALUE;
            
        }
        int ans=root.data;
        for (int i = 0; i < root.children.size(); i++) {
            int childlargest=nodelargestdata(root.children.size());
            if (children>ans) {
                ans=childlargest;

                
            }
            
        }
        return ans;
    }
    
}
