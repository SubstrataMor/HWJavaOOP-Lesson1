public class BottleofWater extends Product{
    private int volume;
    public BottleofWater(String name, double cost, int volume) {
        super(name, cost);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleofWater{" +
                "name = " + super.getName() + '\\' +
                "price = " + super.getCost() + '\\' +
                "volume = " + volume +
                '}';
    }
}