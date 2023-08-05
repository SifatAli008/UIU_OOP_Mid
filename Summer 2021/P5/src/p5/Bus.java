
package p5;


public class Bus implements Vehicle,MotorVehicle{

    @Override
    public void move() {
        System.out.println("Burning engine fuel");    
    }

    @Override
    public void permission() {
        System.out.println("Bus can move in expressway");
    }
    @Override
    public void refill_tank(){
        System.out.println("Filled with fuel");
    }

    
    
}
