//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SmartThermostat thermostat = new SmartThermostat(20);
        System.out.println("Temperatura actual: " + thermostat.getTemperature() + "°C");
        System.out.println("Modo ahorro de energía: " + thermostat.isEnergySavingMode());

        thermostat.decreaseTemperature();
        System.out.println("Temperatura reducida. La temperatura actual es: " + thermostat.getTemperature() + "°C");
        thermostat.increaseTemperature();
        System.out.println("Temperatura aumentada. La temperatura actual es: " + thermostat.getTemperature() + "°C");}
}