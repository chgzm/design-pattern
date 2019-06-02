public class Power200V {
    private final int watt;

    public Power200V(int watt) {
        this.watt = watt;
    }

    public int getWatt() {
        return this.watt;
    }

    @Override
    public String toString() {
        return String.format("200V Power: %d [W]", this.watt);
    }     
}
