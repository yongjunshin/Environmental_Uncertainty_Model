package smarthome;

public class EnvironmentParameterVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private double outdoorTemperature;
    private double outdoorHumidity;

    public EnvironmentParameterVariableSet() {
        this.outdoorTemperature = 0;
        this.outdoorHumidity = 0;
    }

    public double getOutdoorTemperature() {
        return outdoorTemperature;
    }

    public void setOutdoorTemperature(double outdoorTemperature) {
        this.outdoorTemperature = outdoorTemperature;
    }

    public double getOutdoorHumidity() {
        return outdoorHumidity;
    }

    public void setOutdoorHumidity(double outdoorHumidity) {
        this.outdoorHumidity = outdoorHumidity;
    }

    public EnvironmentParameterVariableSet clone() throws CloneNotSupportedException {
        return (EnvironmentParameterVariableSet)super.clone();
    }
}
