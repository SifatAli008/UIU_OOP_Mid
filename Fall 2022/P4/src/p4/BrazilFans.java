
package p4;


public class BrazilFans extends Fifa{
 private int havingWorldCups;

    public BrazilFans(int noOfGoals, String venue ,int havingWorldCups) {
        super(noOfGoals, venue);
        this.havingWorldCups=havingWorldCups;
        
    }
 
    void IncrementWorldCups(){
        
   this.havingWorldCups=havingWorldCups+1;
    }
    
    
 @Override
        public String toString(){
            
            return " [ Number of Goal : "+ getNoOfGoals()  +". Venue : "+getVenue()+" "+" ] , "+" havingWorldCups : "+havingWorldCups;
        }
        
        
}

  