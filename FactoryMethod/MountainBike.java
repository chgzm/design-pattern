public class MountainBike implements Bike {
    @Override
    public void ride() {
        System.out.println("Ride a mountain bike.");
    }

    @Override
    public String toString() {
        return "Mountain bike";
    }
}
