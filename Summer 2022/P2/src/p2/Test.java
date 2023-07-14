package p2;

public class Test {// class Foodmain

    public static void main(String[] args) {
        Homemade f = new Homemade(5.0, 8.0, 10.0, 11.0);
        f.Homemadereviwe();

        Food f1 = new Homemade(5.0, 8.0, 10.0, 11.0);
        ((Homemade) f1).Homemadereviwe();

        Food f2 = new Fastfood(5.0, 8.0, 10.0, "Drink", "sweet");
        ((Fastfood) f2).Fastfoodreviwe();
    }

}
