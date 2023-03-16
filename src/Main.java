public class Main {
    public static void main(String[] args) {
        Airport airport = new Airport();
        Plane plane1 = new Plane(500, 2000.0f);
        Plane plane2 = new Plane(600, 2500.0f);
        airport.addFlyableVehicle(plane1);
        airport.addFlyableVehicle(plane2);

        airport.printFlyableVehicles();
    }
}