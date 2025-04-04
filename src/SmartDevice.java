abstract class SmartDevice {
    String brand;
    String model;
    String status;

    public SmartDevice(String brand, String model, String status) {
        this.brand = brand;
        this.model = model;
        setStatus(status);
    }

    public void turnOn() {
        System.out.println("The device has been turned on");
    }

    public void turnOff() {
        System.out.println("The device has been turned off");
    }

    public abstract void deviceInfo();

    // Get Smart Device status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if(status.equals("ON")) {
            this.status = status;
            System.out.println("The Smart device is ON");
        } else {
            System.out.println("The smart device is OFF");
        }
    }
}
