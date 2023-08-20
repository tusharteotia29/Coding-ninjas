import java.util.ArrayList;

public class Arraylistdemo {

    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();

    list1.add(15);
    list1.add(20);
    list1.add(25);
    // System.out.println(list1.size());
    // System.out.println(list1.get(1));

    list1.add(2,50);

    for (int i = 0; i < list1.size(); i++) {
        System.out.println(list1.get(i));
        
    }

    // list1.remove(1);
    // for (int i = 0; i < list1.size(); i++) {
    //     System.out.print(list1.get(i)+" ");
        
    // }

    for (Integer elem : list1) {
        System.out.print(elem+" ");
        
    }

        
    }

    

    
}
