package p2;

public class Movie {
    private String name;
    String Origin;
    public String Genre;
    public double Rating;
    
    Movie(){

   }
    
     public void setDetails(String Origin, String Genre,double Rating){
         this.Origin=Origin;
         this.Genre=Genre;
         this.Rating=Rating;
   }

    public String getName() {
        return name;
    }
    

    public void setName(String name) {
        this.name = name;
    }
    
    
    void Details(){
        System.out.println("You are watching"+name);
        System.out.println("Origin : "+Origin);
       System.out.println("Genre : "+Genre);
        System.out.println("Rating : "+Rating);
    }
    
}
