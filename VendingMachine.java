import java.util.List;

public interface VendingMachine {
    BottleofWater getProduct(String name, int volume);

    HotDrink getProduct(String name, int volume, int temperature);

    public Product getProduct(String name);
}