package p5;


public class CNG implements Vehicle,MotorVehicle{
    
     @Override
    public void move() {
        System.out.println("Burning engine fuel");    
    }

    @Override
    public void permission() {
        System.out.println("Car can move in highway");
    }
    @Override
    public void refill_tank() {
        System.out.println("Filled with fuel");
    }
}
