package p5b;

public class Square extends Shape {

    double side;

    public Square(double side) {
        side = side;
    }

    @Override
    public void printArea() {
        double area = side * side;
        System.out.println("Area : " + area);
    }
}
