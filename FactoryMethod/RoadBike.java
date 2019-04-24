public class RoadBike implements Bike {
    @Override
    public void ride() {
        System.out.println("Ride a road bike.");
    }

    @Override
    public String toString() {
        return "Road bike";
    }
}
