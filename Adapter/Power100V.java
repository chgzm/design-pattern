public class Power100V {
    private final int watt;

    public Power100V(int watt) {
        this.watt = watt;
    }

    public int getWatt() {
        return this.watt;
    }

    @Override
    public String toString() {
        return String.format("100V Power: %d [W]", this.watt);
    }     
}
