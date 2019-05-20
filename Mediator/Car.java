public class Car implements Participant {
    private boolean stopFlag = false;
    
    @Override 
    public void setStopFlag(boolean stopFlag) {
        this.stopFlag = stopFlag;
    }

    @Override
    public void proceed() {
        if (this.stopFlag) {
            System.out.println("Car stops.");
        } else {
            System.out.println("Car proceeds.");
        }
    }
}
