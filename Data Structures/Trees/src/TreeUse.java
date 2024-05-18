public class TreeUse {

    public static void main(String[] args) {
        Treesnode<Integer> root=new Treesnode<Integer>(4);
        Treesnode<Integer> node1=new Treesnode<Integer>(2);
        Treesnode<Integer> node2=new Treesnode<Integer>(3);
        Treesnode<Integer> node3=new Treesnode<Integer>(5);
        Treesnode<Integer> node4=new Treesnode<Integer>(6);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add( node3);
        node2.children.add(node4);

        System.out.println(root);
        
    }
    
}
