import java.util.ArrayList;

public class Airport {
    ArrayList<Flyable> flyable = new ArrayList<>();

    public void addFlyableVehicle(Flyable vehicle) {
        flyable.add(vehicle);
    }

    public void printFlyableVehicles() {
        for (Flyable vehicle : flyable) {
            System.out.println(vehicle.toString());
        }
    }
}
