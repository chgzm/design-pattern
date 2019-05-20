public class TrafficLightImpl implements TrafficLight {
    private Car        car;
    private Pedestrian pedestrian;

    public void setCar(Car car) {
        this.car = car;
    }

    public void setPedestrian(Pedestrian pedestrian) {
        this.pedestrian = pedestrian;
    }

    @Override
    public void waiting() {
        if (this.car != null) {
            this.car.setStopFlag(true);
        }

        this.pedestrian.setStopFlag(false);
    }

    @Override
    public void crossed() {
        if (this.car != null) {
            this.car.setStopFlag(false);
        }

        this.pedestrian.setStopFlag(true);
    }
}
