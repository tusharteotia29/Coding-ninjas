import java.util.Scanner;

import javax.swing.tree.TreeNode;

public class takeinputrecursive {

    public static Treesnode<Integer> takeinput(){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter next node data");
        n=s.nextInt();
        Treesnode<Integer> root=new Treesnode<Integer>(n);
        System.out.println("Enter no. of children for"+n);
        int childcount=s.nextInt();
        for (int i = 0; i < childcount; i++) {
            Treesnode<Integer> child=takeinput();
            root.children.add(child);
            
        }
        return root;
    }

    public static void print(Treesnode<Integer> root){

        String s=root.data+":";
        for (int i = 0; i < root.children.size(); i++) {
            s=s+root.children.get(i).data+",";
            
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
            
        }
    }

    public static Treesnode<Integer> takeInputLevelWise() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		QueueUsingLL<Treesnode<Integer>> pendingNodes = new QueueUsingLL<>();
		Treesnode<Integer> root = new Treesnode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			try {
				Treesnode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter num of children of " + frontNode.data);
				int numChildren = s.nextInt();
				for (int i = 0; i < numChildren; i++) {
					System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
					int child = s.nextInt();
					Treesnode<Integer> childNode = new Treesnode<Integer>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} catch (QueueEmptyException e) {
				// Shouldn't come here
				return null;
			}
		}
		return root;
	}
    public static void main(String[] args) {
        Treesnode<Integer> root=takeinput();
        print(root);
        
    }
    
}
