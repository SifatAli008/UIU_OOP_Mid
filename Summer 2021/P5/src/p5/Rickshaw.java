package p5;

public class Rickshaw implements Vehicle {

    @Override
    public void move() {
        System.out.println("Paddling the chain");
    }

    @Override
    public void permission() {
        System.out.println("Rickshaw can move in narrow streets");
    }
}
