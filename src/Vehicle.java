abstract class Vehicle {
    int speed;
    float weight;
    abstract void startEngine();
    abstract void turnOffEngine();

    public Vehicle(int speed, float weight) {
        this.speed = speed;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return speed + " " + weight;
    }
}
