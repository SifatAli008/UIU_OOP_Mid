package transport;

import publicTransport.Bus;


public class Test {

    public static void main(String[] args) {
    Vehicle obj ;
    obj= new Bus();
    ((Bus)obj).setLincenseNO(1234);
        System.out.println("Number of  Whewls : "+obj.getNoOfWheels()+" "+". Lincense No : "+((Bus)obj).getLincenseNO() );   
    }
    
}
