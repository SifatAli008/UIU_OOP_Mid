package p2;

public class Food {

    Double calories, fat, carb;

    Food(Double calories, Double fat,Double carb) {
        this.calories = calories;
        this.fat = fat;
        this.carb = carb;
    }

    void description() {
        System.out.println("Inside Food class");
    }
}
