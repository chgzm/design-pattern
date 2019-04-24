public enum BikeType {

    MOUNTAIN(0, "Mountain"),
    ROAD    (1, "Road"),
    CITY    (2, "City");

    private final int value;
    private final String name;

    private BikeType(int value, String name) {
        this.value = value;
        this.name  = name;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
