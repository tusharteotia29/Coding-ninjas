import javax.swing.tree.TreeNode;

public class find_height {

    public static int getHeight(TreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		  if (root == null)
            return 0;

        int max = 1;
        for (TreeNode<Integer> child : root.children) {
            int childHeight = 1 + getHeight(child);
            if (max < childHeight)
                max = childHeight;
        }
        return max;
	
	}
    
}
