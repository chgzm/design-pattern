public class BridgestoneBikeFactory extends BikeFactory {
    @Override
    public Bike createBike(BikeType type) {
        switch (type) {
        case MOUNTAIN: { return new MountainBike();                            }
        case ROAD:     { return new RoadBike();                                }
        case CITY:     { return new CityBike();                                }
        default:       { throw  new IllegalArgumentException("Invalid type."); }
        }
    }
}
