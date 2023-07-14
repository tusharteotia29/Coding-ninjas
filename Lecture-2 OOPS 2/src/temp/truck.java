package temp;

import vehicle.Vehicle;

public class truck extends Vehicle {
    int loadingcapacity;
    public void print(){
        System.out.println("truck loading capacity:"+loadingcapacity);
        System.out.println("truck loading color:"+color);
        System.out.println("truck loading maxspedd:"+getMaxspeed());

        
    }

    
}
