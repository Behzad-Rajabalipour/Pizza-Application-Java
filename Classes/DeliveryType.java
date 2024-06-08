package Package18.Classes;

public enum DeliveryType {
    Bike(120),MotorCycle(500),Drone(750);
    public final int value;
    DeliveryType(int value) {
        this.value= value;
    }
}
