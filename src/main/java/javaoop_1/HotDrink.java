package javaoop_1;

public class HotDrink extends Product {

    private Double volume;
    private int temperature;

    public HotDrink (String name, Double cost, Double volume, Integer temperature) {
        super(name, cost);
        this.volume = volume;
        this.temperature = temperature;
    }

    public Double getVolume() {
        return volume;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() + '\'' +
                "cost='" + super.getCost() + '\'' +
                "volume=" + this.volume + '\'' +
                "temperature=" + this.temperature +
                '}';
    }
}
