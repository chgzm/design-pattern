public class Main {
    public static void main(String[] args) {
        final TrafficLightImpl trafficLightImpl = new TrafficLightImpl();
        final Car car = new Car();
        final Pedestrian pedestrian = new Pedestrian(trafficLightImpl);

        trafficLightImpl.setCar(car);
        trafficLightImpl.setPedestrian(pedestrian);

        car.proceed();
        pedestrian.proceed();

        pedestrian.stopRequest();

        car.proceed();
        pedestrian.proceed();

        car.proceed();
        pedestrian.proceed();
    }
}
