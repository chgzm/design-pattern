public abstract class BikeFactory {
    public final Bike create(BikeType type) {
        Bike bike = this.createBike(type);
        this.registerBike(bike);

        return bike;
    }

    private void registerBike(Bike bike) {
        System.out.println(bike + " is registered.");
    }

    public abstract Bike createBike(BikeType type);
}
