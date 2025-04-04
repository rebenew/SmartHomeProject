public class SmartThermostat {
    private int temperature;

    public SmartThermostat(int initialTemperature) {
        setTemperature(initialTemperature);
    }

    public void setTemperature(int temperature) {
        if (temperature >= 10 && temperature <= 30) {
            this.temperature = temperature;
        } else {
            System.out.println("Temperatura fuera del rango permitido. No se aplicaron cambios.");
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
    public int getTemperature() {
        return this.temperature;
    }
}
