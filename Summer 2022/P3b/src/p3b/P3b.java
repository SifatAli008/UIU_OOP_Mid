package p3b;

public class P3b {

    public static void main(String[] args) {
        
        Point p1 = new Point(3, 5);
        Point p2 = new Point(10, 15);
        PointDemo demo = new PointDemo();
       
        demo.resetPoint1(p1);
        System.out.println("(" + p1.x + ", " + p1.y + ")"); // Question (i)-->3 ,5

        
        demo.resetPoint2(p2);
        System.out.println("(" + p2.x + ", " + p2.y + ")"); // Question (i)-->0 , 0
        
       p2 = new Point(9, 9); // Question (ii)
    }

}
