import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product water = new Product("Frost", 1.1);
        System.out.println(water);

        VendingMachine l1 = new VendingMachine();
        System.out.println(l1);

        List<Product> l2 = new ArrayList<>();
        l2.add(water);
        l2.add(new Product("wine", 25.5));
        l2.add(new Product("sugar", 3));
        
        // l2.add(new Soda("Fanta", 3, "grape"));

        l2.add(new Chocolate("Milka", 24, "milk"));
        l2.add(new Chocolate("Alenka", 23, "white"));
        l2.add(new Chocolate("MnM", 14, "dark"));

        l2.add(new Coffee("Jacobs", 11, "ground"));
        l2.add(new Coffee("Lavazza", 38, "beans"));
        l2.add(new Coffee("Nescafe", 15, "instant"));
        System.out.println(l2);

        VendingMachine l3= new VendingMachine(l2);
        System.out.println(l3);
        System.out.println(l3.findByName("Fanta"));
        System.out.println(l3.findByPrice(3));
        System.out.println(l3.findByPriceRange(4, 30));
    }
}