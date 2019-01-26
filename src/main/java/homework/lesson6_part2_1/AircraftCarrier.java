package homework.lesson6_part2_1;

public class AircraftCarrier extends Warship {
    public AircraftCarrier(String shipName) {
        super(shipName);
    }

    @Override
    public void sail() {
        System.out.println(shipName + " is sailing");
    }

    @Override
    public void moor() {
        System.out.println(shipName + " is mooring");
    }
}
