public class NukaCola extends BasicCola{
    private double cesium;

    public NukaCola(double cesium) {
        super(10, 12.0);
        this.cesium = cesium;
    }

    public double getCesium() {
        return cesium;
    }

    public double cesiumLeft(int year) {
        return cesium * Math.pow(0.97716, year);
    }

    @Override
    public double weight() {
        return super.weight() + cesium;
    }

    @Override
    public double weight(int year) {
        return super.weight() + cesiumLeft(year);
    }

    @Override
    public double getSugar() {
        return super.getSugar();
    }

    @Override
    public double getCaffeine() {
        return super.getCaffeine();
    }

    @Override
    public double getWater() {
        return super.getWater();
    }
}
