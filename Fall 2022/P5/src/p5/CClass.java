package p5;

public class CClass extends PClass {
    
    @Override
    void mFnc(){
        System.out.println("Hello from C Class!");
        super.mFnc(11.12);
    }
    
    void mFnc(int a2 , double d2){
     mFnc(d2);
      System.out.println("Integar value: "+ a2);
    }
}
