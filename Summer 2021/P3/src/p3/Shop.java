package p3;

import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Item items[] = new Item[2];

        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter Number " +(i+1)+ " Info.");

            System.out.print("Enter product name : ");
            String name = in.next();

            System.out.print("Enter product Price : ");
            int price = in.nextInt();

            System.out.print("Enter product Discount : ");
            double discount = in.nextDouble();
            
            System.out.println(" ");
            
            items[i] = new DiscountedItem(name,price,discount);
        }
        
        for (Item item : items) {
            System.out.println(item.getPrice());
        }
    }
}
