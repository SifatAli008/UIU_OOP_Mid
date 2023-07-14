package p4;

public class Person {

    double id, height, weight;
    String name;

    void BMI(double height,double weight) {
        System.out.println("BMI : " + weight / (height * height));

    }

}
