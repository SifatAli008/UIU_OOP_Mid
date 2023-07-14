package americansuperhero;

public class Spiderman {
    String movieName,directedBy;

    public Spiderman(String movieName, String directedBy) {
        this.movieName = movieName;
        this.directedBy = directedBy;
    }
  public void show(){
      System.out.println("Movie Name : "+movieName);
      System.out.println("Directed By : "+directedBy);  
    }
}
