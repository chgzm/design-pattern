public class Pedestrian implements Participant {
    private final TrafficLight trafficLight;
    private boolean stopFlag = true;

    public Pedestrian(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }
    
    @Override 
    public void setStopFlag(boolean stopFlag) {
        this.stopFlag = stopFlag;
    }

    @Override
    public void proceed() {
        if (this.stopFlag) {
            System.out.println("Pedestrian stops.");
        } else {
            System.out.println("Pedestrian proceeds.");
            this.trafficLight.crossed();
        }
    }

    public void pushButton() {
        this.trafficLight.waiting();
    }
}
