import java.util.ArrayList;

public class Treesnode<T> {

    public T data;
    public ArrayList<Treesnode<T>> children;

    public Treesnode(T data){
        this.data=data;
        children=new ArrayList<>();
    }
    
}
