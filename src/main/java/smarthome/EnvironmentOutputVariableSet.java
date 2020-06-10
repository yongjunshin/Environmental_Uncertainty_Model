package smarthome;

public class EnvironmentOutputVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private double indoorTemperature;
    private double indoorHumidity;

    public EnvironmentOutputVariableSet() {
        this.indoorTemperature = 0;
        this.indoorHumidity = 0;
    }

    public double getIndoorTemperature() { return indoorTemperature; }

    public void setIndoorTemperature(double indoorTemperature) {
        this.indoorTemperature = indoorTemperature;
    }

    public double getIndoorHumidity() {
        return indoorHumidity;
    }

    public void setIndoorHumidity(double indoorHumidity) {
        this.indoorHumidity = indoorHumidity;
    }

    public EnvironmentOutputVariableSet clone() throws CloneNotSupportedException {
        return (EnvironmentOutputVariableSet)super.clone();
    }
}
