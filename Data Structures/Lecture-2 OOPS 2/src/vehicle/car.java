package vehicle;

public class car extends Vehicle {

    

    int numgears;
    boolean convertible;

    public car(int numgears,int maxspeed){
        super(maxspeed);
        this.numgears=numgears;
        System.out.println("car constructor");

    }

    public void print(){
        // System.out.println("Car color:"+color);
        // System.out.println("Car maxspedd:"+getMaxspeed()); 
        super.print();
        System.out.println("Car numgears:"+numgears);
        System.out.println("Car covertible:"+convertible);

    }
    
}
