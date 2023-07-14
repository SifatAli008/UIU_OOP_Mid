package p2;

public class Homemade extends Food{
    double Protein;
    
    
    public Homemade(Double calories, Double fat, Double carb, double Protein) {
        super(calories, fat, carb);
         this.Protein=Protein;
    }
    
    @Override
      void description() {
        System.out.println("Inside Food class");
    }
      
      
      void Homemadereviwe(){
         System.out.println("Inside the review method of Homemade class.");
     }
      
    
}
