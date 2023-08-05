package p5;

public class Test {

    public static void main(String[] args) {
        Vehicle rickshaw = new Rickshaw();
        Vehicle cng = new CNG();
        Vehicle car = new Car();
        Vehicle bus = new Bus();
        rickshaw.move();
        cng.move();
        car.move();
        bus.move();
        
        System.out.println();
        
        rickshaw.permission();
        cng.permission();
        car.permission();
        bus.permission();

        System.out.println();
        ((MotorVehicle)cng).refill_tank();
        ((MotorVehicle)car).refill_tank();
        ((MotorVehicle)bus).refill_tank();
    }

}
