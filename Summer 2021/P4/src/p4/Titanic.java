package p4;

public class Titanic {

    String directorName;
    String featuredSong;

    public Titanic(String directorName, String featuredSong) {
        this.directorName = directorName;
        this.featuredSong = featuredSong;
    }

    {
        System.out.println("Titanic sank in the North Atlantic Ocean on 15 April 1912 after striking an iceberg.");
    }

    void showDetails() {
        System.out.println("DirectorName : " + directorName);
        System.out.println("FeaturedSong : " + featuredSong);
    }

}
