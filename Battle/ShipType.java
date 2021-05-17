package Battle;

public enum ShipType {
    CARRIER(1),
    CRUISER (2),
    BATTLESHIP(3),
    DESTROYER(3),
    SUBMARINE(4);

    public final Integer label;


    ShipType(Integer label) {
        this.label = label;
    }
}
