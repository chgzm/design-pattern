public class Main {
    public static void main(String[] args) {
        BikeFactory factory = new BridgestoneBikeFactory();
        Bike mountainBike = factory.create(BikeType.MOUNTAIN);
        Bike roadBike     = factory.create(BikeType.ROAD);
        Bike cityBike     = factory.create(BikeType.CITY);

        mountainBike.ride();
        roadBike.ride();
        cityBike.ride();
    }
}
