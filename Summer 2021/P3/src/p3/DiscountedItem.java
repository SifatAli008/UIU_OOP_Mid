
package p3;


public class DiscountedItem extends Item{
    double discount;

    public DiscountedItem(String name,double price, double discount) {
        this.name=name;
        this.price=price;
        this.discount = discount;
    }


    @Override
    public double getPrice(){
       double total = price - (price * discount / 100);
       return total;
    }
    
    
}
