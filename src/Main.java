//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SmartThermostat thermostat = new SmartThermostat("Google Nest", "T3007ES", true, 22);

        thermostat.turnOn();
        thermostat.deviceInfo();

        thermostat.setTemperature(15);
        thermostat.decreaseTemperature();
        thermostat.decreaseTemperature();
        thermostat.increaseTemperature();

        System.out.println("Energy Saving Mode: " + thermostat.isEnergySavingMode());

     }
}