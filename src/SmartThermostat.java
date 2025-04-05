public class SmartThermostat extends SmartDevice{
    private int temperature;

    public SmartThermostat(String brand, String model, boolean status, int initialTemperature) {
        super(brand, model, status);
        setTemperature(initialTemperature);
    }

    public void setTemperature(int temperature) {
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
        return this.temperature < 20;
    }

    @Override
    public void deviceInfo() {
        System.out.println("Smart Thermostat - Brand: " + brand + ", Model: " + model + ", Status: " + getStatus() +
                ", Temperature: " + temperature + "°C");
    }
}
