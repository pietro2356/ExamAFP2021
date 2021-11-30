public class BasicCola {
    private double sugar;
    private double caffeine;
    private double water = 300.0;

    public BasicCola(double sugar, double caffeine){
        this.sugar = sugar;
        this.caffeine = caffeine;
    }

    public double weight(){
        return sugar + caffeine + water;
    }

    public double weight(int year){
        return sugar + caffeine + water;
    }

    public double getSugar() {
        return sugar;
    }

    public double getCaffeine() {
        return caffeine;
    }

    public double getWater() {
        return water;
    }
}
