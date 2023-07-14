package p2;

public class Fastfood extends Food {
    String Type;
     String Flavour;

    public Fastfood(Double calories, Double fat, Double carb, String Type, String Flavour) {
        super(calories, fat, carb);
        this.Type=Type;
        this.Flavour=Flavour;
    }
     
     void Fastfoodreviwe(){
         System.out.println("Inside the review method of Fastfood class.");
     }
}
