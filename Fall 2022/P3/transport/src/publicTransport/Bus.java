package publicTransport;

import transport.Vehicle;

public class Bus extends Vehicle {
    private int lincenseNO;

    public Bus() {
      super(4);
    }
    
   

     Bus(int lincenseNO) {
         super(4);
        this.lincenseNO = lincenseNO;
    }

    public int getLincenseNO() {
        return lincenseNO;
    }

    public void setLincenseNO(int lincenseNO) {
        this.lincenseNO = lincenseNO;
    }

   
    
    
}
