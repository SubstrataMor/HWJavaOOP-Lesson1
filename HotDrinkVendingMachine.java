import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    List<HotDrink> productList;

    public HotDrinkVendingMachine(List<HotDrink> productList) {
        this.productList = productList;
    }

    public List<HotDrink> getProductList() {
        return productList;
    }

    public void setProductList(List<HotDrink> productList) {
        this.productList = productList;
    }

    @Override
    public BottleofWater getProduct(String name, int volume) {
        return null;
    }

    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrink hotDrink : productList) {
            if (hotDrink.getName().equals(name)
                    && hotDrink.getVolume() == volume
                    && hotDrink.getTemperature() == temperature){
                return hotDrink;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void addBottleOfWater(HotDrink hotDrink) {
        this.productList.add(hotDrink);
    }
}