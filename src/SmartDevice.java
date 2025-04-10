abstract class SmartDevice {
    String brand;
    String model;
    boolean status;

    public SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.status = false;
    }

    public void turnOn() {
        status = true;
        System.out.println(model + " is now ON");
    }

    public void turnOff() {
        status = false;
        System.out.println(model + " is now OFF");
    }

    public abstract void deviceInfo();

    // Get Smart Device status
    public boolean getStatus() {
        return status;
    }
}
