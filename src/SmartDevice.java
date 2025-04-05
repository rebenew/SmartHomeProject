abstract class SmartDevice {
    String brand;
    String model;
    boolean status;

    public SmartDevice(String brand, String model, String status) {
        this.brand = brand;
        this.model = model;
        this.status = false;
    }

    public void turnOn() {
        status = true;
        System.out.println("The device has been turned on");
    }

    public void turnOff() {
        status = false;
        System.out.println("The device has been turned off");
    }

    public abstract void deviceInfo();

    // Get Smart Device status
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        if(status) {
            System.out.println("The Smart device is ON");
        } else {
            System.out.println("The smart device is OFF");
        }
    }
}
