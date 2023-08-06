package p4;

public class Main {

    public static void main(String[] args) {
        BrazilFans b = new BrazilFans(3, "Qatar", 5);
        ArgentinaFans a = new ArgentinaFans(5, "Qatar", 3);
        
        int brazil = b.getNoOfGoals();
        int argentena = a.getNoOfGoals();
        
        if (argentena > brazil) {
            a.IncrementWorldCups();
            System.out.println("Argentina will win");
        } 
        
        else {
            b.IncrementWorldCups();
            System.out.println("Brazil will win");
        }
        
        System.out.println(b.toString());
        System.out.println(a.toString());

    }
}
