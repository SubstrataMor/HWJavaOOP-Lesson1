import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HotDrink> listProduct = new ArrayList<>();
        listProduct.add(new HotDrink("Coffee", 10, 20, 45));
        listProduct.add(new HotDrink("Tea", 12, 25, 60));
        listProduct.add(new HotDrink("Latte", 15, 30, 70));
        listProduct.add(new HotDrink("Raff", 20, 35, 65));
        listProduct.add(new HotDrink("Glintvein", 30, 50, 72));
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine(listProduct);
        System.out.println(vendingMachine.getProduct("Tea"));
        System.out.println(vendingMachine.getProduct("Latte", 30, 70));
        System.out.println(vendingMachine.getProduct("Glintvein", 30));
        System.out.println(vendingMachine.getProduct("Coffee"));
    }
}