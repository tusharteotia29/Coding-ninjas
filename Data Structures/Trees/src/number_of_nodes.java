import javax.swing.tree.TreeNode;

public class number_of_nodes {

    /*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

    public static int numofnodes(TreeNode<Integer> root){
    
        if (root==null) {
            return 0;
    
        }

        int count=1;

        for (int i = 0; i < root.children.size(); i++) {
            count+=numofnodes(root.children.get(i));
            
        }

    }
    
}
