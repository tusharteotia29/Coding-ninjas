import javafx.scene.Node;

public class node<T> {

    T data;
    node<T> next;

    node(T data){
        this.data=data;
        this.next=null;
    }

    
}
