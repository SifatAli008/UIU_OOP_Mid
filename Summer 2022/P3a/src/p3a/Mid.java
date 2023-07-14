package p3a;

public class Mid {

    int x = 10;

    {
        x = 20;
        System.out.println("@Block=" + x);
    }

    Mid(int x1, int x2) {
        x = x1 + x2;
        System.out.println("@Constructor-2=" + x);
    }

    Mid(int x1) {
        this(100, 200);
        x = x1;
        System.out.println("@Constructor-1=" + x);
    }

    Mid() {
        this(50);
        x = 30;
        System.out.println("@Constructor-0=" + x);
    }
}
