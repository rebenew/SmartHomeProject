abstract class SmartDevice {
    String brand;
    String model;
    boolean status;

    public SmartDevice(String brand, String model, boolean status) {
        this.brand = brand;
        this.model = model;
        this.status = status;
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
    public String getStatus() {
        return status ? "ON" : "OFF";
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
