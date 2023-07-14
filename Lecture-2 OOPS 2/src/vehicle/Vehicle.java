package vehicle;

public class Vehicle {

    protected String color;
    private int maxspeed;

    public Vehicle(){
        System.out.println("vehicle constructor");

    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public void print(){
        System.out.println("Vehicle color:"+color);
        System.out.println("Vehicle color:"+maxspeed);
    }
    
}
