public class CityBike implements Bike {
    @Override
    public void ride() {
        System.out.println("Ride a city bike.");
    }

    @Override
    public String toString() {
        return "City bike";
    }
}
