package p4;

public class Fifa {
  private int noOfGoals;  
  private String venue; 
  
  Fifa(){
  
  }
  
   Fifa(int noOfGoals,String venue){
   this.noOfGoals=noOfGoals;
   this.venue=venue;
  }
   
  @Override
    public String toString(){
      return   noOfGoals+" "+venue+" ";
   }

    public int getNoOfGoals() {
        return noOfGoals;
    }
    
     public String getVenue() {
        return venue;
    }
    
    
    
}
