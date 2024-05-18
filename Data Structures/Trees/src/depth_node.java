import javax.swing.tree.TreeNode;

public class depth_node {

    public static int printAtk(TreeNode<Integer> root,int x) {
        if (k<0) {
            return;
            
        }
        if (k==0) {
            System.out.println(root.data);
            return;
        }
        for (int i = 0; i < root.children.size(); i++) {
            printAtk(root.children.get(i),k-1);

            
        }
    }

    
}
