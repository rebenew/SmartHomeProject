public class SmartThermostat extends SmartDevice{
    private int temperature;

    public SmartThermostat(String brand, String model, int initialTemperature) {
        super(brand, model);
        this.temperature = initialTemperature;
    }

    public void setTemperature(int temperature) {
        if (!getStatus()) {
            System.out.println(model + " is OFF. Please turn the device ON to set the temperature.");
            return;
        }

        if (temperature >= 10 && temperature <= 30) {
            this.temperature = temperature;
            System.out.println(model + " temperature set to " + temperature + "°C");
        } else {
            System.out.println("Temperature must be between 10 and 30°C.");
        }
    }
    public void increaseTemperature () {
        setTemperature(this.temperature + 1);
    }

    public void decreaseTemperature() {
        setTemperature(this.temperature - 1);
    }

    public boolean isEnergySavingMode() {
        return temperature < 20;
    }

    @Override
    public void deviceInfo() {
        String state = getStatus() ? "ON" : "OFF";
        System.out.println("SmartThermostat - Brand: " + brand + ", Model: " + model +
                ", Status: " + state + ", Temperature: " + temperature + "°C");
    }
}
